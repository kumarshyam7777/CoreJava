package SmartProgramming.controlstatements;

public class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        int num = 5;
        int fact = 1;
        while(i<=num){
            System.out.println("The value of i: " + i);
            fact = fact * i;
            i++;
        }
        System.out.println("The factorial is: " + fact );
    }
}
