package de.gfn.playground.io;

import java.io.*;
import java.util.Arrays;

public class LeseTest {

    public static void main(String[] args) {


        //File pfad = new File("daten/data.txt");

        File dir = new File("daten");

        if(!dir.exists()) {
            dir.mkdir(); // Erzeugt einen Ordner
            //dir.mkdirs(); // Erzeugt alle Ordner
        }

        File datei = new File(dir, "data.txt");
        System.out.println("Datei? " + datei.isFile());
        System.out.println("Ordner? " + datei.isDirectory());
        System.out.println("absolut? " + datei.isAbsolute());
        System.out.println("versteckt? " + datei.isHidden());
        System.out.println("lesbar? " + datei.canRead());
        System.out.println("beschreibbar? " + datei.canWrite());
        System.out.println("ausführbar? " + datei.canExecute());
        System.out.println("absoluter Pfad? " + datei.getAbsolutePath());

        System.out.println();

        System.out.println("Inhalt von daten/");
        for(String str : dir.list()) {
            System.out.println(str);
        }

        System.out.println();

        /*
        BufferedReader reader = null;
        try {
            if (!datei.exists()) {
                datei.createNewFile(); // Erzeugt eine Datei
            }
            System.out.println("geprüfter Pfad? " + datei.getCanonicalPath());

            // Reader = Liest Zeichen
            // Buffered = jeweils mehrere Zeichen
            // InputStream = Liest Bytes
            reader = new BufferedReader(new FileReader(datei));
            String str;
            while((str = reader.readLine()) != null) {
                System.out.println(str);
            }

            reader.close();
        }
        catch(IOException e) {
            e.printStackTrace();
            if(reader != null) {
                try {
                    reader.close();
                }
                catch (IOException ex) {
                    e.printStackTrace();
                }
            }
        }
        */

        System.out.println();

        // try-with-resources
        try(BufferedReader reader = new BufferedReader(new FileReader(datei))) {

            String str;
            while((str = reader.readLine()) != null) {
                System.out.println(str);
            }
            // reader.close(); wird automatisch aufgerufen
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        // try-with-resources
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(datei))) {

            byte[] buffer = bis.readAllBytes();
            for(byte b : buffer) {
                System.out.print((char) b);
            }
            // reader.close(); wird automatisch aufgerufen
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
}
