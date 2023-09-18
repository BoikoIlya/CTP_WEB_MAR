package com.tant.order;

import java.util.Objects;

public class BookOrder extends OrderAbstract {

    private final String publishingCompanyName;

    private static final String orderType = "Book";

    public BookOrder(String name,String publishingCompanyName) {
        super(name,orderType);
        this.publishingCompanyName = publishingCompanyName;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Publishing company name: "+publishingCompanyName+"\n");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookOrder bookOrder = (BookOrder) o;
        return Objects.equals(publishingCompanyName, bookOrder.publishingCompanyName)
                && Objects.equals(name, bookOrder.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishingCompanyName+name);
    }

    @Override
    public String toString() {
        return "BookOrder{" +
                "publishingCompanyName='" + publishingCompanyName + '\'' +
                '}';
    }
}
