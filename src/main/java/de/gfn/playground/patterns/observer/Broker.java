package de.gfn.playground.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Broker implements Observer {

    private String name;

    private Strategy strategy;

    public Broker(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    @Override
    public void update(Observable o, Object arg) {

        Stock stock = (Stock) o;
        // stock.deleteObserver(this);

        // TODO: Reaktion abhänging vom Steigen oder Fallen
        switch(strategy) {
            case RISKY -> System.out.println(name + ": Kauft " + stock.getName() + " zum Preis von " + stock.getPrice() + "€");
            case NORMAL -> System.out.println(name + ": Hält " + stock.getName());
            case CAREFUL -> System.out.println(name + ": Varkauft " + stock.getName() + " zum Preis von " + stock.getPrice() + "€");
        }

    }
}
