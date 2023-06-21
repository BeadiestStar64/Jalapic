package com.github.jalapic;

import com.github.jalapic.FourArithmeticOperations.addition;

import java.util.ArrayList;

public class Jalapic {

    public static final String jalapic = "[Jalapic]";
    public static void main(String[] args) {
        System.out.println("Welcome to Jalapic!");
        System.out.println(jalapic + "Version 1.0.1");
        addition add = new addition();

        long startTime = System.currentTimeMillis();
        for(int i = 1; i < 10000001; i++) {
            System.out.println(i + (i - 1));
        }
        long endTime = System.currentTimeMillis();

        ArrayList<String> numList = new ArrayList<>();
        for(int i = 1; i< 10000001; i++) {
            String str = String.valueOf(i);
            numList.add(str);
        }

        long startTime2 = System.currentTimeMillis();
        for(int i = 1, let = numList.size(); i < let; i++) {
            String a = numList.get(i);
            String b = numList.get(i - 1);
            add.exactAddition(a,b);
            System.out.println(add.exactAddition(a, b));
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("add実行速度: " + (endTime2 - startTime2) + "ms");
        System.out.println("実行速度: " + (endTime - startTime) + "ms");
    }
}