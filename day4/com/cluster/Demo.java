package com.cluster;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        int num = 10;
        int remainder = num % 2;
        System.out.println("remainder = " + remainder);

        if (remainder == 0) {
            System.out.println(num + " IS EVEN");
        } else {
            System.out.println(num + " IS ODD");
        }
    }
}
