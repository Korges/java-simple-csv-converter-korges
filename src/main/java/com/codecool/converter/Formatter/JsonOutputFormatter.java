package com.codecool.converter.Formatter;

import java.util.List;

public class JsonOutputFormatter implements OutputFormatter {


    public void printToConsole(List<List<String>> data) {

        List<String> label = data.get(0);
        data.remove(0);

        for (List<String> list : data) {

            System.out.println("{");
            for(int i =0 ; i<list.size(); i++) {
                System.out.println("\t\"" + label.get(i) + "\":" + list.get(i));
            }
            System.out.println("},");
        }
    }
}
