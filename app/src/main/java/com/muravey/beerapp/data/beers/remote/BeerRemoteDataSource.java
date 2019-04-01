package com.muravey.beerapp.data.beers.remote;


import android.util.Log;

import com.muravey.beerapp.model.BeerEntity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class BeerRemoteDataSource implements IBeerRemoteDataSource {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.punkapi.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    BeerNetworkClient client = retrofit.create(BeerNetworkClient.class);

    @Override
    public void getBeers(final BeersCallBack callback) {
        Call<List<BeerEntity>> call=client.getBeers(50);
        Log.d("qwe", "50");

        call.enqueue(new Callback<List<BeerEntity>>() {
            @Override
            public void onResponse(Call<List<BeerEntity>> call, Response<List<BeerEntity>> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        callback.onSuccess(response.body());
                    } else {
                        callback.onFailure("Body is empty ");
                    }
                } else {
                    callback.onFailure("Response code" + response.code());
                }
            }

            @Override
            public void onFailure(Call<List<BeerEntity>> call, Throwable t) {
                callback.onFailure(t.getMessage());
            }
        });

    }

    private interface BeerNetworkClient{

        @GET("v2/beers")
        Call<List<BeerEntity>> getBeers(
                @Query("per_page") int perPage
        );

    }
}


