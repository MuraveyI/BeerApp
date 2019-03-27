package com.muravey.beerapp.data.beers;

import com.muravey.beerapp.model.BeerEntity;

import java.util.List;

public interface IBeerDataSours {

    List<BeerEntity> getBeers();

    BeerEntity getBeer(int id);

}
