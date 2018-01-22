package com.codecool;


import com.codecool.converter.SimpleCsvConverter;
import com.codecool.converter.helper.Path;
import com.codecool.converter.helper.Format;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConverterApplication {

    public static void main(String[] args){


        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ConverterContext.xml");
        SimpleCsvConverter csvConverter = ctx.getBean("csvConverter", SimpleCsvConverter.class);

        System.out.println("Application has started...");

        if (args.length == 0) {
            System.out.println("No input file defined");
        } else if(args.length == 1) {
            String path = Path.recognizeFile(args);
            csvConverter.convert(path);
        } else {
            String path = Path.recognizeFile(args);
            csvConverter.convert(path, Format.recognizeFormat(args));
        }

    }
}
