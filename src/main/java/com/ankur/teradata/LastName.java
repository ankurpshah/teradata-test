package com.ankur.teradata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LastName {

    public static void main(String[] args) {

        if(args.length < 1) {
            System.out.println("Please provide file name.");
            System.exit(1);
        }

        String sourceFile = args[0];
        String line = "";
        String fileSplitBy = ":";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] name = line.split(fileSplitBy);
                if(name.length > 1) {
                    System.out.println(name[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
