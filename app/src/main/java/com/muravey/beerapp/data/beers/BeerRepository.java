package com.muravey.beerapp.data.beers;

import com.muravey.beerapp.data.beers.local.IBeerLocalDataSource;
import com.muravey.beerapp.data.beers.remote.IBeerRemoteDataSource;
import com.muravey.beerapp.model.BeerEntity;

import java.util.List;

public class BeerRepository implements IBeerDataSours {

    private IBeerLocalDataSource mLocal;
    private IBeerRemoteDataSource mRemote;

    public  BeerRepository(IBeerLocalDataSource local,
                           IBeerRemoteDataSource remote){
        mLocal = local;
        mRemote = remote;
    }

    @Override
    public List<BeerEntity> getBeers() {
        return null;
    }

    @Override
    public BeerEntity getBeer(int id) {
        return null;
    }
}
