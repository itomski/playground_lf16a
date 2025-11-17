package de.gfn.playground.patterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        EagerLoadingSingleton els1 = EagerLoadingSingleton.getInstance();
        EagerLoadingSingleton els2 = EagerLoadingSingleton.getInstance();

        System.out.println(els1 == els2);

        System.out.println(els1.getCounter());
        System.out.println(els2.getCounter());
        els1.up();
        System.out.println(els1.getCounter());
        System.out.println(els2.getCounter());

        System.out.println();
        doSomething();
        System.out.println();

        System.out.println(els1.getCounter());
        System.out.println(els2.getCounter());

        System.out.println();
        LazyLoadingSingleton lls1 = LazyLoadingSingleton.getInstance();
        LazyLoadingSingleton lls2 = LazyLoadingSingleton.getInstance();
        System.out.println(lls1 == lls2);
        System.out.println(lls1 == LazyLoadingSingleton.getInstance());

    }

    private static void doSomething() {

        EagerLoadingSingleton.getInstance().up();
        System.out.println(EagerLoadingSingleton.getInstance().getCounter());

    }
}
