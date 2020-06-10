package com.sherkhancrs;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number  = scanner.nextInt();
        String result = "";
        if (number%3==0) {
            result += "Fizz";
        }
        if (number%5==0) {
            result += "Buzz";
        }
        if (number%5!=0 && number%3!=0) {
            result += number;
        }

        System.out.println(result);
    }
}
