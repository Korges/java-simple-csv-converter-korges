package com.codecool.converter.Formatter;

import java.util.List;

public class TableOutputFormatter implements OutputFormatter{


    public void printToConsole(List<List<String>> data) {

        for(List<String> list : data) {
            for(String s : list) {
                System.out.print(s + ", ");
            }
            System.out.println();
        }
    }
}
