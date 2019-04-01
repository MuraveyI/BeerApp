package com.muravey.beerapp.presentation.beers.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beerapp.R;
import com.muravey.beerapp.model.BeerEntity;

import java.util.ArrayList;
import java.util.List;

public class BeersAdapter extends RecyclerView.Adapter<BeerViewHolder> {

    private List<BeerEntity> beers = new ArrayList<>() ;

    @NonNull
    @Override
    public BeerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_beer, viewGroup, false);

        return new BeerViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull BeerViewHolder holder, int i) {

        BeerEntity beerEntity = beers.get(i);
        holder.onBind(beerEntity);

    }

    @Override
    public int getItemCount() {
        return beers.size();
    }

    public void setBeers(List<BeerEntity> beers){ // для установление задачи
        this.beers.clear();
        this.beers.addAll(beers);
        notifyDataSetChanged();

    }
}
