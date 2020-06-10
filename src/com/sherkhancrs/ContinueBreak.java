package com.sherkhancrs;

import java.util.Scanner;

public class ContinueBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        String[] names = {"Sherkhan", "Max", "Tim"};

        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+" "+i);
        }

        while (true) {
            System.out.print("Input: ");
            input  = scanner.next().toLowerCase();

            if (input.equals("path")){
                continue;
            }
            if(input.equals("quit")) {
                break;
            }

            System.out.println(input);
        }
    }
}
