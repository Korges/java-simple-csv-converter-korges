package com.codecool.converter;

import com.codecool.converter.Factory.OutputFormatterFactory;
import com.codecool.converter.formatter.OutputFormatter;
import com.codecool.converter.helper.Format;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class SimpleCsvConverter {

    FileReader fileReader;
    OutputFormatterFactory outputFormatterFactory;

    SimpleCsvConverter(FileReader fileReader, OutputFormatterFactory outputFormatterFactory) {

        this.fileReader = fileReader;
        this.outputFormatterFactory = outputFormatterFactory;

    }


    public void convert(String file){

        convert(file, Format.TABLE);
    }


    public void convert(String file, Format outputFormat){


        try {
            List<List<String>> data = fileReader.readData(file);
            OutputFormatter factory = outputFormatterFactory.createByFormat(outputFormat);
            factory.printToConsole(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
