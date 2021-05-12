package loops;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=2;i<=10;i+=2){
            if (i==8)
                continue;
            System.out.println("The value of i : " + i);
        }
    }
}
