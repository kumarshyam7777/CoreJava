package com.durgasir.corejava.type_of_variable;

import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        System.out.println("taking input from user..");
        Scanner scanner = new Scanner(System.in);
        //  int a = scanner.nextInt();
        //  System.out.print("Enter the no 2: ");
        //  int b = scanner.nextInt();
        //  int sum = a + b;
        //  System.out.println("The sum of these numbers is : " + sum);

        //System.out.println("Enter the floating point no 1:");
        //float f1 = scanner.nextFloat();
        // System.out.println("Enter the floating point no 2:");
        // float f2 = scanner.nextFloat();

        // float sum2 = f1 + f2;
        // System.out.println("The sum of 2 float nos are: " + sum2);
        System.out.println("Enter an input...");
//        boolean b1 = scanner.hasNextInt();
//        System.out.println(b1);
//        String str = scanner.nextLine();
//        System.out.println(str);

        boolean b2 = scanner.hasNext();
        System.out.println(b2);


    }

}
