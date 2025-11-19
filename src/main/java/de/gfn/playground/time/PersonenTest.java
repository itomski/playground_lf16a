package de.gfn.playground.time;

public class PersonenTest {

    public static void main(String[] args) {

        Person p1 = new Person("Max", "Mustermann");
        System.out.println(p1);
        Person p2 = Person.rand();
        System.out.println(p2);
        System.out.println(Person.rand());
        System.out.println(Person.rand());
        System.out.println(Person.rand());
        System.out.println(Person.rand());
        System.out.println(Person.rand());
        System.out.println(Person.rand());
    }

}
