package com.muravey.beerapp.data.beers.local;

import com.muravey.beerapp.model.BeerEntity;

import java.util.List;

public interface IBeerLocalDataSource {
    List<BeerEntity> loadBeers(); // this for reading
    void setBeers(List<BeerEntity> beers);  // this for saving
}
