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

    public static Format recognizeFormat(String format) {

        return Format.valueOf(format.toUpperCase());
    }
}