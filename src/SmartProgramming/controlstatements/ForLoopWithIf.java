package SmartProgramming.controlstatements;

public class ForLoopWithIf {
    public static void main(String[] args) {
        for(int i = 10;i>=1;i--){
            if(i%2 == 0){
                System.out.println("Descending number with even:" + i);
            } else {
                System.out.println("Descending number with odd:" + i);
            }
        }
    }
}
