package de.gfn.playground.io;

import java.io.*;
import java.util.Properties;

public class PropertyTest {

    private static final String PROP_FILE = System.getProperty("user.home") + "/config.properties";
    private static final String XML_FILE = System.getProperty("user.home") + "/config.xml";

    public static void main(String[] args) {

        // Eine spezielle Art einer Map
//        Properties config = new Properties();
//        config.put("user", "tlubowiecki");
//        config.put("password", "geheim#123");
//        config.put("language", "de");

        // Speichern
//        try(Writer out = new BufferedWriter(new FileWriter(PROP_FILE))) {
//            config.store(out, null);
//        }
//        catch (IOException e) {
//            System.out.println("Problem beim Speichern");
//        }

//        try(OutputStream out = new BufferedOutputStream(new FileOutputStream(XML_FILE))) {
//            config.storeToXML(out, null);
//        }
//        catch (IOException e) {
//            System.out.println("Problem beim Speichern");
//        }

        // Lesen
        Properties config = new Properties();
        try(Reader in = new BufferedReader(new FileReader(PROP_FILE))) {
            config.load(in);
        }
        catch (IOException e) {
            System.out.println("Problem beim Lesen");
        }

//        try(InputStream in = new BufferedInputStream(new FileInputStream(XML_FILE))) {
//            config.loadFromXML(in);
//        }
//        catch (IOException e) {
//            System.out.println("Problem beim Lesen");
//        }


        System.out.println(config.getOrDefault("user", "Nicht bekannt"));
        System.out.println(config.getOrDefault("password", "Nicht gesetzt"));
        System.out.println(config.getOrDefault("language", "Nicht gesetzt"));

    }
}
