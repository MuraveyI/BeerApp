package com.muravey.beerapp.presentation.beers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.beerapp.R;
import com.muravey.beerapp.presentation.beerdetails.BeerDetailPresenter;
import com.muravey.beerapp.presentation.beerdetails.IBeerDetailsContract;

public class BeerDetailsFragment extends AppCompatActivity  implements IBeerDetailsContract.View{

    private IBeerDetailsContract.Presenter mPrsenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_details_fragment);
        mPrsenter = new BeerDetailPresenter();
        mPrsenter.attachView(this);

    }

    @Override
    public void attachPresenter(IBeerDetailsContract.Presenter presenter) {

    }

    @Override
    public void finishView() {

    }
}
