package de.gfn.playground.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjekteLesen {

    private static final String SER_FILE = "personen.ser";

    public static void main(String[] args) {

        //List<Person> liste = new ObjekteLesen().readFromFile();
        var liste = new ObjekteLesen().readFromFile();
        for(Person p : liste)
            System.out.println(p.getVorname() + " " + p.getNachname());

    }

    public List<Person> readFromFile() {

        List<Person> liste = new ArrayList<>();

        // ObjectInputStream liest serialisierte Objektstrukturen ein
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(SER_FILE))) {
            liste = (List<Person>) in.readObject();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Problem beim Lesen");
        }

        return liste;
    }
}
