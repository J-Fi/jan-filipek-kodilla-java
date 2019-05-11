package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> list) {
        List<Integer> evenList = new ArrayList<>();
        for (Integer temp : list) {
            if (temp % 2 == 0) {
                evenList.add(temp);
            }
        }
        return evenList;
    }
}
