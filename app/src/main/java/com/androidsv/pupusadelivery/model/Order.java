package com.androidsv.pupusadelivery.model;
import java.util.HashMap;
import io.realm.RealmObject;

/**
 * Created by moizest89 on 3/25/17.
 */

public class Order extends RealmObject{

    private long id;
    private User user;
    private String status;
    private HashMap<Product, Integer> products = new HashMap<>();

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

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
    }
}
