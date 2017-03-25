package com.androidsv.pupusadelivery.model;

import io.realm.RealmObject;

/**
 * Created by moizest89 on 3/25/17.
 */

public class ProductOrder extends RealmObject{

    private int qty;
    private Product product;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
