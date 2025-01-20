package com.varunu28.moduleone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Playing with Lists
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        list.forEach(System.out::println);
    }
}
