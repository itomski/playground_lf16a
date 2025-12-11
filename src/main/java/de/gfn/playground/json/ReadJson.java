package de.gfn.playground.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadJson {

    public static void main(String[] args) {

        Gson gson = new Gson();

        Path path = Paths.get("heros.json");

        try(Reader reader = Files.newBufferedReader(path)) {

            List<Hero> heros = gson.fromJson(reader, new TypeToken<List<Hero>>() {}.getType());
            heros.forEach(h -> System.out.println(h));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
