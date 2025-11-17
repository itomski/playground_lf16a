package de.gfn.playground.patterns.singleton;

public class LazyLoadingSingleton {

    // Statische Variable mit einer Instanz der Klasse
    private static LazyLoadingSingleton instance;

    private int counter;

    // Privater Konstruktor
    private LazyLoadingSingleton() {
    }

    // Statische Methode zum Abfragen der Instanz
    public static LazyLoadingSingleton getInstance() {
        if(instance == null) {
            // TODO: Aktuell noch nicht Thread-Save
            instance = new LazyLoadingSingleton();
        }
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
