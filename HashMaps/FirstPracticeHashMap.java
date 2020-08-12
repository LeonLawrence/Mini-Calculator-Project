package com.company.HashMaps;

import java.util.HashMap;

public class FirstPracticeHashMap {

    public static void myHash() {
        //HashMap is just a list of keys and values. Different keys have different values
        //A long list on the left that are set to their values on the right

        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);
        System.out.println(happy.get("c"));

    }
}
