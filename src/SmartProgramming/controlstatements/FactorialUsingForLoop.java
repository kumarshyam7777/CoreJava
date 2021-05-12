package SmartProgramming.controlstatements;

import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        int fact = 1;
        int num = 6;
       // int factorial = 1;
       // Scanner scanner = new Scanner(System.in);
       // System.out.print("Enter the no from keyboard:-");
       // int num2 = scanner.nextInt();

        for(int i = 1;i<=num;i++){
           // System.out.println("The value of i: " + i);
            fact = fact * i;
        }
        System.out.println("The factorial result is :" + fact);
       /* for(int j = 1;j<=num2; j++){
            System.out.println("The value of j:" + j);
            factorial = factorial * j;
        }
        System.out.println("The factorial result is :" + factorial); */
    }
}
