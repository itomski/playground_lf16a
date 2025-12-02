package de.gfn.playground.patterns.observer;

public class ObserverTest {

    public static void main(String[] args) {

        Stock asml = new Stock("ASML", "NL0010273215", 934.80);
        Stock apple = new Stock("Apple", "US0378331005", 243.35);

        Broker peter = new Broker("Peter Parker", Strategy.NORMAL);
        Broker bruce = new Broker("Bruce Banner", Strategy.RISKY);
        asml.addObserver(peter);
        asml.addObserver(bruce);
        apple.addObserver(bruce);

        asml.changePrice(0.87);
        System.out.println();
        asml.changePrice(-0.12);
        System.out.println();
        asml.changePrice(0.1);
        System.out.println();
        asml.changePrice(-0.02);
        System.out.println();
        asml.changePrice(-0.04);
        System.out.println();
        apple.changePrice(-0.2);
    }
}
