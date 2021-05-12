package SmartProgramming.controlstatements;


import java.util.Scanner;

class Subject {
   // int total = 100;
    int obtain;
}

public class AverageScanner {
    public static void main(String[] args) {
        Subject sub1 = new Subject();
        System.out.println("Enter Maths Marks:");
        Scanner sc = new Scanner(System.in);
        sub1.obtain = sc.nextInt();
        Subject sub2 = new Subject();
        System.out.println("Enter English  Marks:");
        sub2.obtain = sc.nextInt();
        Subject sub3 = new Subject();
        System.out.println("Enter Science Marks:");
        sub3.obtain = sc.nextInt();
        Subject sub4 = new Subject();
        System.out.println("Enter  SocialScience Marks:");
        sub4.obtain = sc.nextInt();
        Subject sub5 = new Subject();
        System.out.println("Enter Hindi Marks:");
        sub5.obtain = sc.nextInt();
        int total_marks = (sub1.obtain) + (sub2.obtain) + (sub3.obtain) + (sub4.obtain) + (sub5.obtain);
        System.out.println("The Total marks is:" + total_marks);
        float percentage = (total_marks * 100) / 500;
        System.out.println("The percentage is:" + percentage);


    }
}
