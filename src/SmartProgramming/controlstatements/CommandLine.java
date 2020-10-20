package SmartProgramming.controlstatements;

public class CommandLine {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("The square root of " + n + " is " + (n * n));
        System.out.print("The sum of 2 values: ");
        System.out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[2]));
    }

}