package com.codecool.converter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class FileReader {

    public List<List<String>> readData(String file) {

        String line = "";
        String csvSplitBy = ",";
        List<List<String>> data = null;

        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader(file));
            while ((line = br.readLine()) != null) {
                List<String> row = null;
                row.add(line.split(csvSplitBy).toString());
                data.add(row);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}