package com.codecool.converter;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArgsRecognizer {

    public String path = null;
    List<String> acceptedTypesList =  Arrays.asList("JSON", "TABLE", "XML");
    public Map argsMap = new HashMap();

   ArgsRecognizer() {

       this.argsMap.put("type", "TABLE");
   }


    public Map recognize(String[] args) {

        if(isSizeOK(args)) {
            argRecognizer(args);
        }
        return this.argsMap;
    }


    public boolean isSizeOK(String[] args) {

        return (args.length > 0 & args.length <= 2);

    }


    public void argRecognizer(String[] args) {

        for(String s : args) {
            setPath(s);
            setType(s);
        }
    }


    public void setType(String arg) {

        if(acceptedTypesList.contains(arg.toUpperCase())) {
            this.argsMap.put("type", arg);
        }
    }


    public void setPath(String arg) {

        for (int i = 0; i < arg.length(); i++) {
            String letter = String.valueOf(arg.charAt(i));
            if (letter.equals(".")) {
                String[] parts = arg.split("\\.");
                if (parts[1].equals("csv")) {
                    this.argsMap.put("path", arg);
                    this.path = arg;
                }
            }
        }
    }


    public boolean hasPath() {

        boolean hasPath = false;

        if(this.path != null) {
            hasPath = true;
        } else {
            System.out.println("No input file defined");
        }
        return hasPath;
    }
}
