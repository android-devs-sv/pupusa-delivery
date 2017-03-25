package com.androidsv.pupusadelivery.model;

import io.realm.RealmObject;

/**
 * Created by moizest89 on 3/25/17.
 */

public class Flavour extends RealmObject{

    private long id;
    private String name;
    private long type;


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

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }
}
