package com.muravey.beerapp.presentation.beers;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.beerapp.R;
import com.muravey.beerapp.model.BeerEntity;
import com.muravey.core.CoreMvpContract;
import java.util.ArrayList;

public class BeersFragment extends Fragment implements IBeersContract.View {

 private IBeersContract.Presenter mPresenter;

   RecyclerView recyclerView;
   Adapter adapter ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beers, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView .setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        mPresenter = new BeersPresenter();


        mPresenter.attachView(this);

        mPresenter.getBeers();

       return view;

    }

    @Override
    public void showBeers(ArrayList<BeerEntity> beers) {
        Log.e("TAG", "showBeers: ========= " + beers);
        adapter = new Adapter(beers);
       recyclerView.setAdapter(adapter);
    }

    @Override
    public void openBeerDetails(int id) {

    }

    @Override
    public void attachPresenter(CoreMvpContract.Presenter presenter) {


    }

    @Override
    public void finishView() {

    }
}
