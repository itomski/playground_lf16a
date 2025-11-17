package de.gfn.playground.io;

import java.io.*;

public class SchreibTest {

    public static void main(String[] args) {

        File pfad = new File("daten/data.txt");

        if(pfad.exists()) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(pfad, true))) {
                //writer.write("Das ist das Haus von Nikigraus");
                writer.append("Das ist das Haus von Nikigraus");
                writer.newLine();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
