package com.codecool.converter.Factory;

import com.codecool.converter.Formatter.JsonOutputFormatter;
import com.codecool.converter.Formatter.OutputFormatter;
import com.codecool.converter.Formatter.TableOutputFormatter;
import com.codecool.converter.Formatter.XmlOutputFormatter;

public class OutputFormatterFactory {

    public OutputFormatter createByFormat(String outputFormat) {

        OutputFormatter outputFormatter = null;

        if(outputFormat.equals("TABLE")) {
            outputFormatter = new TableOutputFormatter();
        }
        if(outputFormat.equals("JSON")) {
            outputFormatter = new JsonOutputFormatter();
        }
        if(outputFormat.equals("XML")) {
            outputFormatter = new XmlOutputFormatter();
        }
        return outputFormatter;
    }
}
