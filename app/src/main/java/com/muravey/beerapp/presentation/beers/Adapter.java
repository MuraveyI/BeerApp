package com.muravey.beerapp.presentation.beers;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beerapp.R;
import com.muravey.beerapp.model.BeerEntity;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<BeersHolder> {

    private List<BeerEntity> beers;

    public Adapter(ArrayList<BeerEntity> beers) {

        this.beers = beers;

    }

    @NonNull
    @Override
    public BeersHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.beers_list, viewGroup, false);

        return new BeersHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull BeersHolder holder, int i) {

        BeerEntity beerEntity = beers.get(i);
        holder.title.setText(beerEntity.getName());

    }

    @Override
    public int getItemCount() {
        return beers.size();
    }
}
