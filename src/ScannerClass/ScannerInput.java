package ScannerClass;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the days in a week: ");
        int sc = scanner.nextInt();
        System.out.println("There is " + sc + " days in a week");
    }
}
