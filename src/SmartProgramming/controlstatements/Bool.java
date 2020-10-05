package SmartProgramming.controlstatements;

import java.util.Scanner;

public class Bool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextBoolean();
        System.out.println(a);
        typeof(a);
    }

    private static void typeof(boolean a) {
        System.out.println("The Boolean value: " + a);
    }


}
