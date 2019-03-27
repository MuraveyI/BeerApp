package com.muravey.beerapp.presentation.beers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.beerapp.R;
import com.muravey.beerapp.model.BeerEntity;
import com.muravey.core.CoreMvpContract;

import java.util.ArrayList;

public class BeersActivity extends AppCompatActivity {

    private IBeersContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_beer);

        BeersFragment fragment = new BeersFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(android.R.id.content, fragment).commit();


        mPresenter = new BeersPresenter();
        mPresenter.attachView(fragment);
        mPresenter.getBeers();
    }




}
