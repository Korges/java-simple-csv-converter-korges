package com.codecool.converter;

import java.util.Map;

public class ConverterApplication {

    public static void main(String[] args) {

        ArgsRecognizer recognizer = new ArgsRecognizer();
        SimpleCsvConverter csvConverter = new SimpleCsvConverter();


        System.out.println("Application has started...");
        Map<String, String> argsMap = recognizer.recognize(args);

        if(recognizer.hasPath()){

            csvConverter.converter(argsMap.get("path"), argsMap.get("type"));

        }
    }
}
