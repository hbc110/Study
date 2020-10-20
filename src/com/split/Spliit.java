package com.split;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spliit {
    public static void main(String[] args) {
        String str = "20M@1";
        String regex = "\\d*";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(str);

        while (m.find()) {
            if (!"".equals(m.group()))
                System.out.println(m.group());
        }
        String s1=str.split("M@")[0];
        long speed = Long.parseLong(s1);
        System.out.println(s1);
        System.out.println(speed);
    }
}
