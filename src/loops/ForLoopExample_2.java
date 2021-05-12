package loops;
import java.lang.*;

public class ForLoopExample_2 {
    public static void main(String[] args) {
        for (int i =1;i<=3;i++){
            for (int j = 1;j<=10;j++){
                if (j==5)
                    break;
                System.out.println("the j value: " + j);
            }
            System.out.println();
        }
    }
}
