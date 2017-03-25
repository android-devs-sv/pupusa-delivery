package com.androidsv.pupusadelivery.model;

import io.realm.RealmObject;

/**
 * Created by moizest89 on 3/25/17.
 */

public class Product extends RealmObject{

    private long id;
    private String name;
    private double price;
    private String type;
    private String flour;
    private Flavour flavour;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public Flavour getFlavour() {
        return flavour;
    }

    public void setFlavour(Flavour flavour) {
        this.flavour = flavour;
    }
}
