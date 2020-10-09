package SmartProgramming.controlstatements;


import java.util.Scanner;

class Subject {
    int total = 100;
    int obtd;
}

public class AverageScanner {
    public static void main(String[] args) {
        Subject sub1 = new Subject();
        System.out.println("Enter Maths Marks:");
        Scanner sc = new Scanner(System.in);
        sub1.obtd = sc.nextInt();
        Subject sub2 = new Subject();
        System.out.println("Enter English  Marks:");
        sub2.obtd = sc.nextInt();
        Subject sub3 = new Subject();
        System.out.println("Enter Science Marks:");
        sub3.obtd = sc.nextInt();
        Subject sub4 = new Subject();
        System.out.println("Enter Socail Science Marks:");
        sub4.obtd = sc.nextInt();
        Subject sub5 = new Subject();
        System.out.println("Enter Hindi Marks:");
        sub5.obtd = sc.nextInt();
        int total_marks = (sub1.obtd) + (sub2.obtd) + (sub3.obtd) + (sub4.obtd) + (sub5.obtd);
        System.out.println("The Total marks is:" + total_marks);
        int percentage = (total_marks * 100) / 500;
        System.out.println("The percentage is:" + percentage);


    }
}
