package com.tant.bookstore;

import com.tant.order.Order;

public interface BookStore {

    void makeOrder(Order type);

    void showCart();
}
