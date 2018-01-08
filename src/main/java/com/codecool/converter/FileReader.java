package com.codecool.converter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<List<String>> readData(String file) {

        String csvSplitBy = ",";
        List<List<String>> data = new ArrayList<List<String>>();


        try {

            BufferedReader br = new BufferedReader(new java.io.FileReader(file));
            String line = br.readLine();

            while (line != null) {
                List<String> row = new ArrayList<String>();
                String[] words = line.split(csvSplitBy);
                for(String s : words) {
                    row.add(s);
                }
                data.add(row);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}