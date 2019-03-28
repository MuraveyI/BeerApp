package com.muravey.beerapp.presentation.beers;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.muravey.beerapp.model.BeerEntity;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<BeersHolder> {

    private List<BeerEntity> beers;
    @NonNull
    @Override
    public BeersHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BeersHolder holder, int i) {

    }

    @Override
    public int getItemCount() {
        return beers.size();
    }
}
