package com.tant.bookstore;

import com.tant.bookstore.BookStore;
import com.tant.order.JournalOrder;
import com.tant.order.Order;

import java.util.ArrayList;
import java.util.function.Consumer;

public class BookStoreImpl implements BookStore {

    private final ArrayList<Order> cart = new ArrayList<>();

    @Override
    public void makeOrder(Order order) {
        cart.add(order);
    }

    @Override
    public void showCart() {
        cart.forEach(Order::showInfo);
    }


}
