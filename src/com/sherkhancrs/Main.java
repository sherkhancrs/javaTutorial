package com.sherkhancrs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double result = (double)10/3;
        System.out.println(result);

        int x = 1;
        int y = x++;
        // int y = ++x;
        System.out.println(x);
        System.out.println(y);

        double a = 1.1;
        String b = "2";
        double c = Double.parseDouble(b) + a;
        System.out.println(c);

        int q = 1;
        double w = q + 2; //implicit casting скрытое/неявное
        System.out.println(w);

        int t = 1;
        double u = 2.2 + (double)t; //explicit casting явное/точное
        System.out.println(u);

        int i = (int) Math.round(2.49);
        int o = (int) (Math.random()*100);
        System.out.println(i);
        System.out.println(o);
    }
}
