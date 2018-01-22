package com.codecool.converter.helper;

public class Path {


    public static String recognizeFile(String[] args) {
        String path = null;
        for (String s : args) {
            if (validateFile(s)) {
                path = s;
            }
        }
        ifNullThrowException(path);
        return path;
    }


    private static boolean validateFile(String arg) {
        boolean hasPath = false;

        for (int i = 0; i < arg.length(); i++) {
            String letter = String.valueOf(arg.charAt(i));
            if (letter.equals(".")) {
                String[] parts = arg.split("\\.");
                hasPath = parts[1].equals("csv");
            }
        }
        return hasPath;
    }

    public static void ifNullThrowException(String path) {
        if(path == null) {
            throw new NullPointerException("Wrong path");
        }
    }



}