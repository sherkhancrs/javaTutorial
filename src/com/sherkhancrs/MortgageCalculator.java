package com.sherkhancrs;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal;
        double rate;
        byte years;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            rate = scanner.nextDouble();
            if (rate > 0 && rate <= 30) break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            years  = scanner.nextByte();
            if (years > 0 && years <= 30) break;
            System.out.println("Enter a value between 1 and 30");
        }

        double monthlyRate = rate/PERCENT/MONTHS_IN_YEAR;
        int numberOfPayments = years*MONTHS_IN_YEAR;
        double mortgage = (principal * monthlyRate*Math.pow(1+monthlyRate,numberOfPayments))/(Math.pow((1+monthlyRate),numberOfPayments)-1);
        System.out.println("Mortgage: "+NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
