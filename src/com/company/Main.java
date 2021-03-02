package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String[]> zvirata = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("animals.csv"));

            String nextLine = br.readLine();
            while (nextLine != null){
                String [] row = nextLine.split(";");
                zvirata.add(row);


                nextLine = br.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i < zvirata.size(); i++) {


            if (zvirata.get(i)[1].equals("TYPE")){
                zvirata.get(i)[1] = "TYP_ZVÍŘETE";
            }
            if (zvirata.get(i)[2].equals("NAME")){
                zvirata.get(i)[2] = "JMÉNO_ZVÍŘETE";
            }

        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ukol1/ukol1.txt"));

            for (int i = 0; i < zvirata.size(); i++) {
                bw.write(zvirata.get(i)[2]);
                bw.write(";");
                bw.write(zvirata.get(i)[1]);
                bw.write(";");
                bw.write(zvirata.get(i)[4]);
                bw.newLine();
            }

            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
