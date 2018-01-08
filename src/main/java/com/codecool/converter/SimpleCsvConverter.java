package com.codecool.converter;

import com.codecool.converter.Factory.OutputFormatterFactory;
import com.codecool.converter.Formatter.OutputFormatter;

import java.util.List;

public class SimpleCsvConverter {

    FileReader fileReader;
    OutputFormatterFactory outputFormatterFactory;

    SimpleCsvConverter(FileReader fileReader, OutputFormatterFactory outputFormatterFactory) {

        this.fileReader = fileReader;
        this.outputFormatterFactory = outputFormatterFactory;

    }


    public void convert(String file, String outputFormat) {

        List<List<String>> data = fileReader.readData(file);
        OutputFormatter factory = outputFormatterFactory.createByFormat(outputFormat);
        factory.printToConsole(data);
    }
}
