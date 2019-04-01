package com.muravey.beerapp.presentation.beers;

import com.muravey.beerapp.model.BeerEntity;
import com.muravey.core.CoreMvpContract;

import java.util.ArrayList;

public interface IBeersContract {
    interface View extends CoreMvpContract.View<Presenter>{

        void showBeers(ArrayList<BeerEntity> beers );

        void openBeerDetails(int id);

    }

    interface Presenter extends CoreMvpContract.Presenter<View>{

        void onBeerClick(int position);

        void getBeers();

    }
}
