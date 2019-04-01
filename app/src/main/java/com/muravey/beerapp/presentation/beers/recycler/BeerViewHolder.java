package com.muravey.beerapp.presentation.beers.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.beerapp.R;
import com.muravey.beerapp.model.BeerEntity;


public class BeerViewHolder extends RecyclerView.ViewHolder {


    private TextView title;


    public BeerViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.beer_name);

    }

     void onBind(BeerEntity beer){
        title.setText(beer.getName());
    }

}
