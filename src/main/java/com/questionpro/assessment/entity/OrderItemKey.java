package com.questionpro.assessment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class OrderItemKey implements Serializable {

    @Column(name = "order_id"/*, nullable = false, insertable=false, updatable=false*/)
    private int orderId;

    @Column(name = "item_id"/*, nullable = false, insertable=false, updatable=false*/)
    private int itemId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
