package com.company.HashMaps;

import java.util.HashMap;

public class SecondPracticeHashMap {

    public static void myHashTwo() {
        HashMap<String, String> userPass = new HashMap<String, String>();
        userPass.put("LeonLawrence1995", "Coding5!");
        userPass.put("Tony1996", "Password123");

        userPass.remove("LeonLawrence1995");

        System.out.println(userPass);
        System.out.println(userPass.containsValue("Password123"));
        System.out.println(userPass.containsValue("Password1234"));

        if (userPass.containsKey("Tony1996")) {
            System.out.println("User Exist");
        } else {
            System.out.println("User not in HashMap");
        }

        userPass.replace("Tony1996", "Newpassword123");
        System.out.println(userPass);
    }
}
