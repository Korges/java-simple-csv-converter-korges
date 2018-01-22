package com.codecool.converter.formatter;

import java.util.List;

public class TableOutputFormatter implements OutputFormatter{


    public void printToConsole(List<List<String>> data) {

        for(List<String> line : data) {

            String formattedLine = line.toString()
                    .replace("[","")
                    .replace("]","");

            System.out.println(formattedLine);

        }
    }
}
