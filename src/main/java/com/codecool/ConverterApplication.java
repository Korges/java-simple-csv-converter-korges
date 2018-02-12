package com.codecool;

import com.codecool.converter.SimpleCsvConverter;
import com.codecool.converter.helper.Format;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class ConverterApplication {

    public static void main(String[] args){

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ConverterContext.xml");
        SimpleCsvConverter csvConverter = ctx.getBean("simpleCsvConverter", SimpleCsvConverter.class);

        System.out.println("Application has started...");

        if (args.length == 0) {
            System.out.println("No input file defined");
        } else if(args.length == 1) {
            csvConverter.convert(new File(args[0]));
        } else {
            try {
                csvConverter.convert(new File(args[0]), Format.recognizeFormat(args[1]));
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong output format");
            }
        }
    }
}