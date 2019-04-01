package com.muravey.beerapp.model;

import com.google.gson.annotations.SerializedName;

public class BeerEntity {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;


    @SerializedName("description")
    private String description;

    @SerializedName("image_url")
    private String imageUrl;


    //region Constructor

    public BeerEntity() {

    }

    public BeerEntity(String name, int id, String description, String imageUrl) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.imageUrl = imageUrl;
    }
    //endregion

    //region Getters/Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    //endregion


    @Override
    public String toString() {
        return id + " " + name + " " + description + " " + imageUrl;
    }
}
