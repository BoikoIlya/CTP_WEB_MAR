package com.tant.order;

import java.util.Objects;

public class JournalOrder extends OrderAbstract {

    private final int periodBetweenReleasesInWeeks;

    private static final String orderType = "Journal";

    public JournalOrder(String name,int periodBetweenReleasesInWeeks) {
        super(name,orderType);
        this.periodBetweenReleasesInWeeks = periodBetweenReleasesInWeeks;
    }

    

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Amount of weeks between releases: "+periodBetweenReleasesInWeeks+"\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JournalOrder that = (JournalOrder) o;
        return Objects.equals(periodBetweenReleasesInWeeks, that.periodBetweenReleasesInWeeks)
                && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodBetweenReleasesInWeeks+name);
    }

    @Override
    public String toString() {
        return "JournalOrder{" +
                "periodBetweenReleasesInWeeks=" + periodBetweenReleasesInWeeks +
                '}';
    }
}
