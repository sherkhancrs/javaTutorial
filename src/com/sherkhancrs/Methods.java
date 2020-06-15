package com.sherkhancrs;

public class Methods {
    public static void main(String[] args){
        String message = greetUser("Shera", "Zhanibekov");
        System.out.println(message);

    }

    public static String greetUser(String firstName, String lastName) {
        return "Hello "+firstName+" "+lastName;
    }
}

