package com.muravey.beerapp.data.beers.remote;

import com.muravey.beerapp.model.BeerEntity;

import java.util.List;

public interface IBeerRemoteDataSource {
    List<BeerEntity> loadBeers();
}
