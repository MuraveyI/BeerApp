package com.muravey.beerapp.presentation.beers;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.beerapp.R;


public class BeersHolder extends RecyclerView.ViewHolder {


    TextView title;


    public BeersHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.beer_name);


    }
}
