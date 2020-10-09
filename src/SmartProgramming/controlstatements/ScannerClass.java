package SmartProgramming.controlstatements;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        //int x = scanner.nextInt();
       // boolean b = scanner.hasNextInt();
        //System.out.println(b);
        System.out.println("Enter a float number:");
        float f = scanner.nextFloat();
        System.out.println("The floating point value:" + f);
        boolean bool = scanner.hasNextFloat() ;
        System.out.println("Is this a float value: " + bool);

    }
}
