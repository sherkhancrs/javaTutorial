package com.sherkhancrs;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        int principal;
        double rate;
        byte years;

        principal = (int) readNumber("Principal ($1K - $1M): ", 1000, 1_000_000);
        rate = readNumber("Annual Interest Rate: ", 1, 30);
        years = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, rate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormatted);
    }

    public static double readNumber(String prompt, int min, int max){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        double value;
        
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max) break;
            System.out.println("Enter a number between "+min+" and "+max);
        }
        return value;
    }

    public static double calculateMortgage(
            int principal,
            double rate,
            byte years) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        double mortgage;

        double monthlyRate = rate/PERCENT/MONTHS_IN_YEAR;
        int numberOfPayments = years*MONTHS_IN_YEAR;

        mortgage = (principal * monthlyRate*Math.pow(1+monthlyRate,numberOfPayments))/(Math.pow((1+monthlyRate),numberOfPayments)-1);
        return mortgage;
    }
}
