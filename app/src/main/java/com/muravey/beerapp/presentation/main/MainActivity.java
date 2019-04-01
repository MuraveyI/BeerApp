package com.muravey.beerapp.presentation.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.beerapp.R;
import com.muravey.beerapp.data.beers.remote.BeerRemoteDataSource;
import com.muravey.beerapp.data.beers.remote.IBeerRemoteDataSource;
import com.muravey.beerapp.model.BeerEntity;
import com.muravey.beerapp.presentation.beers.BeersFragment;
import com.muravey.beerapp.presentation.beers.BeersPresenter;
import com.muravey.beerapp.presentation.beers.IBeersContract;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private IBeersContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BeersFragment fragment = new BeersFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(android.R.id.content,fragment)
                .commit();

        mPresenter = new BeersPresenter();
        mPresenter.attachView(fragment);

        new BeerRemoteDataSource().getBeers(new IBeerRemoteDataSource.BeersCallBack() {
            @Override
            public void onSuccess(List<BeerEntity> beers) {
                Log.d("qwe", "Beers response"+beers.size());

                for(BeerEntity beerEntity: beers){
                    Log.d("qwe", beerEntity.toString());
                }
            }

            @Override
            public void onFailure(String message) {
                Log.d("qwe", message);
            }
        });
    }


}


