package com.codecool.converter.helper;

public enum Format {
    JSON("json"),
    TABLE("table"),
    XML("xml");

    private String label;

    Format(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public static Format recognizeFormat(String[] args) {
        Format format = null;
        for (Format f: Format.values()) {
            if(validateFormat(f, args)) {
                format = f;
            }
        }
        ifNullThrowException(format);
        return format;
    }

    public static boolean validateFormat(Format f, String[] args) {
        boolean hasFormat = false;
        for(String s: args) {
            if(f.getLabel().equals(s.toLowerCase())){
                hasFormat = true;
            }
        }
        return hasFormat;
    }

    public static void ifNullThrowException(Format format) {
        if(format == null) {
            throw new NullPointerException("Wrong format");
        }
    }
}