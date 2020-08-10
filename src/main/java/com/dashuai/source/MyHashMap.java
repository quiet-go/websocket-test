package com.dashuai.source;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args) {
        Map<String, String> test = new HashMap();

        test.put("test", "aaa");
        String result = test.put("test", "sss");
        System.out.println(result);

        System.out.println(10 & 15);
    }


}
