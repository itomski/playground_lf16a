package de.gfn.playground.patterns.singleton;

public class EagerLoadingSingleton {

    // Statische Variable mit einer Instanz der Klasse
    private final static EagerLoadingSingleton instance = new EagerLoadingSingleton();

    private int counter;

    // Privater Konstruktor
    private EagerLoadingSingleton() {
    }

    // Statische Methode zum Abfragen der Instanz
    public static EagerLoadingSingleton getInstance() {
        return instance;
    }

    public int getCounter() {
        return counter;
    }

    public void up() {
        this.counter++;
    }

    public void down() {
        this.counter--;
    }
}
