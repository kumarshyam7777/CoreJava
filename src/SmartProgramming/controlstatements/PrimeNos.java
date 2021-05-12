package SmartProgramming.controlstatements;

import java.util.Scanner;

public class PrimeNos {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return  true;
    }
        public static void main (String[]args){
            System.out.print("Enter a number:  ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n >=2 && isPrime(n)) {
                System.out.println("The no is prime");
            } else {
                System.out.println("The no is not prime");
            }
        }
    }
