package com.muravey.beerapp.data.beers.remote;

import com.muravey.beerapp.model.BeerEntity;

import java.util.List;

public interface IBeerRemoteDataSource {

    void getBeers(BeersCallBack callback);

    interface BeersCallBack{

        void onSuccess(List<BeerEntity> beers);
        void onFailure(String message);



    }

}
