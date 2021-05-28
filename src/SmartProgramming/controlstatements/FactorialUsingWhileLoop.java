package SmartProgramming.controlstatements;

import java.util.Scanner;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number from keyboard:-");
        int num = scanner.nextInt();
        int fact = 1;
        while(i<=num){
            System.out.println("The value of i: " + i);
            fact = fact * i;
            i++;
        }
        System.out.println("The factorial is: " + fact );
    }
}
