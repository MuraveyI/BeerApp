package com.muravey.beerapp.presentation.beerdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.beerapp.R;

public class BeerDetailActivity extends AppCompatActivity
    implements IBeerDetailsContract.View{


    private IBeerDetailsContract.Presenter mPrsenter; // та хрень которая сама решает что делать и мы вручную создаем

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_detail);

        mPrsenter  = new BeerDetailPresenter();

        mPrsenter.attachView(this);

    }

    @Override
    public void attachPresenter(IBeerDetailsContract.Presenter presenter) {

    }

    @Override
    public void finishView() {

    }
}
