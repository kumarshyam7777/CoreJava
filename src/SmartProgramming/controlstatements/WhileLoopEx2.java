package SmartProgramming.controlstatements;

public class WhileLoopEx2 {
    public static void main(String[] args) {
        int i = 1;
        int anyNo = 5;
        int sum = 0;
        while (i<=anyNo){
            System.out.println("The value of i: " + i);
            // calculate the value of sum with i variable and assigned it to sum
            sum = sum + i; //sum += i;
            i+=1; //i++;

        }
        System.out.println("The Result is: " + sum) ;
    }
}
