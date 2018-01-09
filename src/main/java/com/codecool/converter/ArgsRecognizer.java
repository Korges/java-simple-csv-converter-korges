package com.codecool.converter;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArgsRecognizer {

    private String path = null;
    List<String> acceptedTypesList =  Arrays.asList("JSON", "TABLE", "XML");
    private Map argsMap = new HashMap();

    public ArgsRecognizer() {

       this.argsMap.put("type", "TABLE");
    }


    public Map<String, String> recognize(String[] args) {

        if(isSizeOK(args)) {
            argRecognizer(args);
        }
        return this.argsMap;
    }


    private boolean isSizeOK(String[] args) {

        return (args.length <= 2);

    }


    private void argRecognizer(String[] args) {

        for(String s : args) {
            setPath(s);
            setType(s);
        }
    }


    private void setType(String arg) {

        if(acceptedTypesList.contains(arg.toUpperCase())) {
            this.argsMap.put("type", arg.toUpperCase());
        }
    }


    private void setPath(String arg) {

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


    public boolean hasPathDefined() {

        boolean hasPath = false;

        if(this.path != null) {
            hasPath = true;
        } else {
            System.out.println("No input file defined");
        }
        return hasPath;
    }
}
