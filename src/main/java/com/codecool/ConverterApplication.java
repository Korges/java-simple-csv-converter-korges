package com.codecool;

import com.codecool.converter.ArgsRecognizer;
import com.codecool.converter.SimpleCsvConverter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class ConverterApplication {

    public static void main(String[] args) {

        ArgsRecognizer recognizer = new ArgsRecognizer();

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ConverterContext.xml");
        SimpleCsvConverter csvConverter = ctx.getBean(SimpleCsvConverter.class);

        System.out.println("Application has started...");
        Map<String, String> argsMap = recognizer.recognize(args);

        if(recognizer.hasPathDefined()){

            csvConverter.convert(argsMap.get("path"), argsMap.get("type"));

        }
    }
}
