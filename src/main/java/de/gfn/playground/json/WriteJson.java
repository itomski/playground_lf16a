package de.gfn.playground.json;

import com.google.gson.Gson;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteJson {

    public static void main(String[] args) {

        List<Hero> heros = new ArrayList<>();
        heros.add(new Hero("Spiderman", "Peter Parker", new String[]{"Hamburg", "Ülzen"}));
        heros.add(new Hero("Cap. America", "Steve Rogers", new String[]{"München"}));
        heros.add(new Hero("Black Widow", "Natasha Romanov", new String[]{"Köln", "Berlin", "Kiel"}));

        Gson gson = new Gson();
        //System.out.println(gson.toJson(heros.get(0)));

        //System.out.println(gson.toJson(heros));

        Path path = Paths.get("heros.json"); // Pfad

        try(Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            gson.toJson(heros, writer);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }



}
