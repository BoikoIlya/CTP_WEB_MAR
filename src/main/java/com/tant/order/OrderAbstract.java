package com.tant.order;

import java.util.Objects;

public abstract class OrderAbstract implements Order {

    protected final String name;
    private final String orderType;

    public OrderAbstract(String name,String orderType){
        this.name = name;
        this.orderType = orderType;
    }

    @Override
    public void showInfo() {
        System.out.println("Type: "+orderType);
        System.out.println("Name: "+name);
    }


}
