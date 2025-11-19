package de.gfn.playground.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ObjekteSchreiben {

    private static final String SER_FILE = "personen.ser";

    public static void main(String[] args) {

//        ObjekteSchreiben os = new ObjekteSchreiben();
//        os.saveToFile();

        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Peter", "Parker", LocalDate.of(2000, 7, 18)));
        personen.add(new Person("Carol", "Danvers", LocalDate.of(1995, 1, 5)));
        personen.add(new Person("Steve", "Rogers", LocalDate.of(1923, 9, 9)));

        new ObjekteSchreiben().saveToFile(personen);

    }

    public void saveToFile(List<Person> liste) {

        // ObjectOutputStream schreibt Objektstrukturen serialisiert in eine Datei
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(SER_FILE))) {
            out.writeObject(liste); // Die ganze Liste wird zum Speichern gegeben
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Problem beim Schreiben");
        }
    }
}
