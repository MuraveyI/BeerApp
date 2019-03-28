package com.muravey.beerapp.presentation.beers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.beerapp.R;
import com.muravey.beerapp.model.BeerEntity;
import com.muravey.core.CoreMvpContract;

import java.util.ArrayList;

public class BeersActivity extends AppCompatActivity {

    private IBeersContract.Presenter mPresenter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_beer);
        recyclerView = findViewById(R.id.recycler_view);

        BeersFragment fragment = new BeersFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(android.R.id.content, fragment).commit();


        mPresenter = new BeersPresenter();
        mPresenter.attachView(fragment);
        mPresenter.getBeers();
    }




}
