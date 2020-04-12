package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String [] stringArray = Main.readAllWord("C:\\Users\\Volha_Akunets\\Downloads\\Война и мир.txt");

        ISearchEngine easySearchObj = new EasySearch();

        int result = easySearchObj.search(stringArray, "война");
        System.out.println("Война встречается " + result + " раз");

        result = easySearchObj.search(stringArray, "мир");
        System.out.println("Мир встречается " + result + " раз");

        easySearchObj = new EasySearch2();

        result = easySearchObj.search(stringArray, "и");
        System.out.println("И встречается " + result + " раз");

    }
    private static String[] readAllWord (String filePath){
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream <String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)){
            stream.forEach(s -> contentBuilder.append(s));
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return contentBuilder.toString()
                .replace(".","")
                .replace(",","")
                //.replace(":","")
                //.replace(";","")
                //.replace("-","")
                .split(" ");

        //contentBuilder.toString();
    }
}
