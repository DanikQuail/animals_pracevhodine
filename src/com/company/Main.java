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
            for (int i = 0; i < zvirata.size(); i++) {
                if (zvirata.get(i)[1].equals("0")){
                    zvirata.get (i)[1] = "Dog";
                } else if (zvirata.get (i)[1].equals("1")){
                    zvirata.get(i)[1] = "Cat";
                } else if (zvirata.get (i)[1].equals("2")){
                    zvirata.get(i)[1] = "Donkey";
                } else if (zvirata.get (i)[1] .equals( "3")){
                    zvirata.get(i)[1] = "Parrot";
                } else if (zvirata.get (i)[1] .equals( "4")){
                    zvirata.get(i)[1] = "Horse";
                } else if (zvirata.get (i)[1] .equals( "5")){
                    zvirata.get(i)[1] = "Fox";
                } else if (zvirata.get (i)[1] .equals( "6")){
                    zvirata.get(i)[1] = "Lion";
                }else if (zvirata.get (i)[1] .equals( "7")){
                    zvirata.get(i)[1] = "Tiger";
                }else if (zvirata.get (i)[1] .equals( "8")){
                    zvirata.get(i)[1] = "Lizard";
                }else if (zvirata.get (i)[1] .equals( "9")){
                    zvirata.get(i)[1] = "Bear";
                }

                if (zvirata.get(i)[1].equals("TYPE")){
                    zvirata.get(i)[1] = "TYP_ZVÍŘETE";
                }
                if (zvirata.get(i)[2].equals("NAME")){
                    zvirata.get(i)[2] = "JMÉNO_ZVÍŘETE";
                }

            }
        }catch (IOException e){
            e.printStackTrace();
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
