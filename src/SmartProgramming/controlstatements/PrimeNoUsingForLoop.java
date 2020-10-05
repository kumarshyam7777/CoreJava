package SmartProgramming.controlstatements;

public class PrimeNoUsingForLoop {
    public static void main(String[] args) {
        int x = 13;
        int anyNo = 777;
        for(int i =2;i<x/2;i++){
            if(x%i==0){
                anyNo = 888;
                break;
            }
        }
        if(anyNo==777){
            System.out.println("The no is prime");
        } else{
            System.out.println("The no is not prime");
        }

    }
}
