package com.androidsv.pupusadelivery.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by moizest89 on 3/25/17.
 */

public class Order extends RealmObject{

    private long id;
    private User user;
    private String status;
    private RealmList<ProductOrder> products = new RealmList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ProductOrder> getProducts() {
        return products;
    }

    public void setProducts(RealmList<ProductOrder> products) {
        this.products = products;
    }
}
