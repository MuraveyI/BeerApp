package com.muravey.beerapp;

import android.app.Application;
import android.util.Log;

import com.muravey.beerapp.data.beers.BeerRepository;
import com.muravey.beerapp.data.beers.IBeerDataSours;
import com.muravey.beerapp.data.beers.local.BeerLocalDataSource;

public class BeerApp extends Application {

    public static IBeerDataSours beerRepository; // Singleton
    @Override
    public void onCreate() {
        super.onCreate();
        beerRepository = new BeerRepository(
                new BeerLocalDataSource(), null
        );


        Log.d("qwe", "onCreate: ");
    }
}
