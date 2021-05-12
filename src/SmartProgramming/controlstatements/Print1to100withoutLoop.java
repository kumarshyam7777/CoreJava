package SmartProgramming.controlstatements;

public class Print1to100withoutLoop {
    public static  void printNum(int num){
        if (num<=100){
            System.out.println(num + " Steps ");
            printNum(num+1);
        }
    }
    public static void main(String[] args) {
        int n =1;
        printNum(n);
    }
}
