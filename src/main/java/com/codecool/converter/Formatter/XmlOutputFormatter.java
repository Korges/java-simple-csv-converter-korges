package com.codecool.converter.Formatter;


import java.util.List;

public class XmlOutputFormatter implements OutputFormatter{


    public void printToConsole(List<List<String>> data) {

        List<String> label = data.get(0);
        data.remove(0);
        System.out.println("<XML>");
        for (List<String> list : data) {

            System.out.println("\t<ELEMENT>");
            for(int i =0 ; i<list.size(); i++) {
                System.out.println("\t\t<" + label.get(i) + ">" + list.get(i) + "</" + label.get(i) + ">");
            }
            System.out.println("\t</ELEMENT>");
        }
        System.out.println("</XML>");
    }
}
