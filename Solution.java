package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> map = new HashMap<>();

        for (char ch = 0; ch <= 255; ++ch) {
            map.put(String.valueOf(ch), 0);
        }

        File f = new File(args[0]);
        String fcontent = "";
        Scanner sc = new Scanner(f);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            fcontent = fcontent + s;
        }
        sc.close();

        int count = 0;
        String[] ar = fcontent.split("");

        for (String s : ar) {
            for (String value : ar) {
                if (s.equals(value)) {
                    count++;
                }
            }
            map.put(s, count);
            count = 0;
        }

        for (Map.Entry<String, Integer> en : map.entrySet()) {
            if (en.getValue() > 0 ) {
                System.out.println(en.getKey() + " " + en.getValue());
            }
        }
    }
}
