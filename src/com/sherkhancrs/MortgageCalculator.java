package com.sherkhancrs;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Period (Years): ");
        int years  = scanner.nextInt();

        double monthlyRate = rate/PERCENT/MONTHS_IN_YEAR;
        int numberOfPayments = years*MONTHS_IN_YEAR;
        double mortgage = (principal * monthlyRate*Math.pow(1+monthlyRate,numberOfPayments))/(Math.pow((1+monthlyRate),numberOfPayments)-1);
        System.out.println("Mortgage: "+NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
