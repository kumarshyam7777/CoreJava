package com.recursioninjava.examples;

public class Recursion_Factorial {

    public static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        else {
           return n * factorial(n-1);
        }

    }
    public static void main(String[] args) {
      int n = 5;
        System.out.println("The factorial of " + n + " is: " + factorial(n));
    }
}
