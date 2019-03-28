package com.muravey.beerapp.presentation.beers;

import com.muravey.beerapp.model.BeerEntity;

import java.util.ArrayList;

public class BeersPresenter implements IBeersContract.Presenter {
    IBeersContract.View view;

    @Override
    public void onBeerClick(int position) {

    }

    @Override
    public void getBeers() {
        ArrayList<BeerEntity> beers = new ArrayList<>();
        beers.add(new BeerEntity("Ae", 0, null, null));
        beers.add(new BeerEntity("Ae", 0, null, null));
        beers.add(new BeerEntity("Ae", 0, null, null));
        beers.add(new BeerEntity("Ae", 0, null, null));


        view.showBeers(beers);
    }

    @Override
    public void attachView(IBeersContract.View view) {

    }

    @Override
    public void detachView() {

    }
}
