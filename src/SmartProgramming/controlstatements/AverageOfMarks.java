package SmartProgramming.controlstatements;

import java.util.Scanner;

public class AverageOfMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks1: ");
        int marks_1 = scanner.nextInt();
        System.out.print("Enter the marks2: ");
        int marks_2 = scanner.nextInt();
        System.out.print("Enter the marks3: ");
        int marks_3 = scanner.nextInt();
        System.out.print("Enter the marks4: ");
        int marks_4 = scanner.nextInt();
        System.out.print("Enter the marks5: ");
        int marks_5 = scanner.nextInt();
        float result = (marks_1+marks_2+marks_3+marks_4+marks_5);
        System.out.println(result);
        float avg = result/5;
        System.out.println("The 5 subjects marks of average are: " + avg );
    }
}

