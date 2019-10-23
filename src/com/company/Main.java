package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // (initialization; condition; change)
            if (i % (3 * 5) == 0) {
                // (3*5 = 15) so the first number that is going to be divisible by 3 and  5 will be 15 and
                // ..."FizzBuzz will then populate
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(String.valueOf(i));
            }
        }
    }
}


