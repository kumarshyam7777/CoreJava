package SmartProgramming.controlstatements;

public class ForLoopWIthIfElseIf {
    public static void main(String[] args) {
        for (int i = 50; i >= 1; i--) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Numbers from 50 to 1 with divisibility by both 3 & 5:" + i);
            } else if (i % 5 == 0) {
                System.out.println("Numbers from 50 to 1  divisibility by only 5 : " + i);
            } else if (i % 3 == 0) {
                System.out.println("Numbers divisibility 50 to 1 divisibility by only 3: " + i);
            } else if(i%2 !=0){
                System.out.println("Numbers which are not divisible by 2:" + i);
            }

            else {
                System.out.println("Numbers from 50 to 1 neither divisibility by 3 nor by 5: " + i);
            }
        }
    }
}

