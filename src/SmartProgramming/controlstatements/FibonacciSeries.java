package SmartProgramming.controlstatements;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series....");
        System.out.print(first + " " + second);
        int next;
        for (int i = 2; i <= n; i++) {
            next = first + second;
            System.out.println(next + " ");
            first = second;
            second = next;
        }
    }
}
