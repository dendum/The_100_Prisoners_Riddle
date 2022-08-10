package com.java.prison;

public class PrisonLoop {

    public static void main(String[] args) {
        int goodattempts = 0;
        int badattempts = 0;

        for (int i = 0; i < 100000; i++) {
            if (Room.main())
                goodattempts++;
            else
                badattempts++;
        }

        double result = (double) goodattempts/1000;

        //System.out.println(goodattempts);
        //System.out.println(badattempts);
        System.out.println(result + "%");
    }
}
