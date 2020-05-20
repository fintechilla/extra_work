package com.codesignal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Statistics {
        public static final String delimiter = ",";

        public static void main(String[] args) {
            System.out.println("Hello, World");
            String csvFile = "root/customers/data.csv";

            try{
                File file = new File(csvFile);
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line = "";
                String[] tempArr;
                int id;
                while((line = br.readLine()) != null) {
                    tempArr = line.split(delimiter);
                    for(String tempStr : tempArr) {
                        System.out.print(tempStr + " ");
                    }
                    System.out.println();
                }
                br.close();

            }catch(IOException e) {
                e.printStackTrace();
            }
        }

    }

