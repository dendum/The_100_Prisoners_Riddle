package com.java.prison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Room {

    public static boolean main() {

        List<Integer> Boxes = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            Boxes.add(i);
        }

        Collections.shuffle(Boxes);

        int goodattempts = 0;
        int badattempts = 0;
        for (int i = 1; i <= 100; i++) {
            if (findEscape(i, Boxes)) {
                goodattempts++;
            } else {
                badattempts++;
            }
        }

        return goodattempts == 100;

    }

    static boolean findEscape(int a, List<Integer> boxes) {

        boolean result;
        int attempts = 0;
        int next_box = a;

        while (true) {
            attempts++;
            if (a == boxes.get(next_box - 1)) {
                result = true;
                break;
            } else {
                next_box = boxes.get(next_box - 1);
            }
            if (attempts == 50) {
                result = false;
                break;
            }
        }
        return result;
    }

}
