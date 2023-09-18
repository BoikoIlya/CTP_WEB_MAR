package com.tant;

import com.tant.bookstore.BookStore;
import com.tant.bookstore.BookStoreImpl;
import com.tant.order.BookOrder;
import com.tant.order.JournalOrder;
import com.tant.order.Order;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BookStore store = new BookStoreImpl();

        store.makeOrder(new BookOrder("The Forgettery","Farshore Books"));
        store.makeOrder(new JournalOrder("Clinical Reviews and Opinions",1));
        store.makeOrder(new BookOrder("The Extraordinaries","Tor Teen"));
        store.makeOrder(new JournalOrder("Educational Research and Reviews",3));

        store.showCart();
    }
}