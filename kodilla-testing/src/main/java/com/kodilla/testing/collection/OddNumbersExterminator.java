package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> list) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (Integer temp : list) {
            if (temp % 2 == 0) {
                evenList.add(temp);
            }
        }
        return evenList;
    }
}
