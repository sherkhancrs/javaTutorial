package com.sherkhancrs;

import java.text.NumberFormat;
import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        // NumberFormat percent = NumberFormat.getPercentInstance();
        String result = NumberFormat.getPercentInstance().format(0.23451);
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name  = scanner.nextLine().trim();
        System.out.println("You are "+name);
    }
}
