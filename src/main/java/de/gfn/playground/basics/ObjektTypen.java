package de.gfn.playground.basics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ObjektTypen {

    public static void main(String[] args) {

        // komplex Widening (Upcasting)
        // komplex Narrowing (Downcasting)

        // Referenztyp: Typ der Referenz auf dem Stack (Parent)
        // Objekttyp: Type des Objekts auf dem Heap (Parent)
        Parent p = new Parent();
        System.out.println(p.zahl1); // Nur zahl1 sichtbar

        System.out.println();
        // Referenztyp: Child
        // Objekttyp: Child
        Child c = new Child();
        System.out.println(c.zahl1); // zahl1 sichtbar
        System.out.println(c.zahl2); // zahl2 sichtbar

        System.out.println();
        // Referenztyp: Parent
        // Objekttyp: Child (Der Objekttyp verändert sich nicht!)
        Parent p2 = c; // Upcasting: Child IS-A Parent
        System.out.println(p2.zahl1); // zahl1 sichtbar
       //System.out.println(p2.zahl2); // Error: zahl2 NICHT sichtbar, da die Variable nicht in Parent deklariert ist

        System.out.println();
        NextChild nc = new NextChild();
        System.out.println(nc.zahl1); // zahl1 sichtbar
        System.out.println(nc.zahl2); // zahl2 sichtbar

        //Child c2 = nc; // Error: NextChild IS-NOT Child
        p2 = c; // Child IS-A Parent
        p2 = nc; // NextChild IS-A Parent

        List<Parent> elemente = new ArrayList<>();
        // Objekte aller Kindklassen von Parent können in der Liste abgelegt werden
        elemente.add(c);
        elemente.add(nc);
        elemente.add(p);

        for(Parent obj : elemente) {
            System.out.println(obj.zahl1);
        }

        System.out.println();

        Object[] data = new Object[5];
        data[0] = "Moin"; // Upcasting von String zu Object
        data[1] = 125; // Autoboxing von int zu Integer und dann Upcasting von Integer zu Object
        data[2] = LocalDate.now(); // ... Upcasting von LocalDate zu Object
        data[3] = new ArrayList<String>(); // ... Upcasting von ArrayList zu Object
        data[4] = 'c'; // Autoboxing von char zu Character und dann Upcasting von Character zu Object

        // Downcasting: Der Typ auf dem Heap MUSS zu dem gewüschten Cast passen

        for(Object o : data) {
            if(o instanceof String) // ist o ein String?
                System.out.println(((String)o).toUpperCase()); // Downcasting von Object zu String

            if(o instanceof Integer)
                System.out.println(((Integer)o).doubleValue()); // Downcasting von Object zu Integer

            if(o instanceof LocalDate)
                System.out.println(((LocalDate)o).getDayOfWeek()); // Downcasting von Object zu LocalDate

            if(o instanceof ArrayList)
                System.out.println(((ArrayList)o).size()); // Downcasting von Object zu ArrayList

            if(o instanceof Character)
                System.out.println(((Character)o).charValue()); // Downcasting von Object zu Character
        }
    }
}

class Parent {

    public int zahl1 = 10;

}

class Child extends Parent {

    public int zahl2 = 20;
}

class NextChild extends Parent {

    public int zahl2 = 30;
}