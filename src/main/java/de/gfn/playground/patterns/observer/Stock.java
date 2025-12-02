package de.gfn.playground.patterns.observer;

import java.util.Observable;

public class Stock extends Observable {

    private String name;
    private String isin;
    private double price;

    public Stock(String name, String isin, double price) {
        this.name = name;
        this.isin = isin;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getIsin() {
        return isin;
    }

    public double getPrice() {
        return price;
    }

    public void changePrice(double percent) {
        price = price + (price * percent / 100);
        System.out.printf("%s(%s): Neuer Preis %.3f €\n", name, isin, price);
        setChanged();
        notifyObservers();
    }
}
