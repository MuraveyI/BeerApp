package com.muravey.beerapp.presentation.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.beerapp.R;
import com.muravey.beerapp.presentation.beers.BeersFragment;
import com.muravey.beerapp.presentation.beers.BeersPresenter;
import com.muravey.beerapp.presentation.beers.IBeersContract;

public class MainActivity extends AppCompatActivity {

    private IBeersContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BeersFragment fragment = new BeersFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.beer_frame,fragment).commit();

        mPresenter = new BeersPresenter();
        mPresenter.attachView(fragment);
    }
}


