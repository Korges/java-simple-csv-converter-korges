package com.codecool.converter.factory;

import com.codecool.converter.formatter.OutputFormatter;
import com.codecool.converter.helper.Format;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class OutputFormatterFactory {

    public OutputFormatter createByFormat(Format outputFormat) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        String formatterName = StringUtils.capitalize(outputFormat.getLabel()) + "OutputFormatter";
        Class formatter = Class.forName("com.codecool.converter.formatter." + formatterName);

        return (OutputFormatter) formatter.newInstance();
    }
}
