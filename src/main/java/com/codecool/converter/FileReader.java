package com.codecool.converter;

import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FileReader {

    public List<List<String>> readData(String file) {

        String line ="";
        List<List<String>> data = new ArrayList<List<String>>();

        try {

            BufferedReader br = new BufferedReader(new java.io.FileReader(file));

            while ((line = br.readLine()) != null) {

                data.add(Arrays.asList(line.split(",")));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}