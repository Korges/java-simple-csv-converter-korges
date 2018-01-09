package com.codecool.converter.Formatter;

import java.util.List;

public class JsonOutputFormatter implements OutputFormatter {


    public void printToConsole(List<List<String>> data) {

        List<String> label = data.get(0);
        data.remove(0);

        System.out.println("[");
        for (List<String> list : data) {

            System.out.println("{");
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size() - 1) {
                    System.out.println("\t\"" + label.get(i) + "\":\"" + list.get(i) + "\",");
                } else {
                    System.out.println("\t\"" + label.get(i) + "\":\"" + list.get(i) + "\"");
                }
            }
            if (data.indexOf(list) < data.size()-1) {

                System.out.println("},");
            } else {

                System.out.println("}");
            }
        }
        System.out.println("]");
    }
}
