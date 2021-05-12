package SmartProgramming.controlstatements;

public class AsciCharCodePattern {
    public static void main(String[] args) {
        int x = 65;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (x + i) );
                //System.out.println((char) (x+i));
            }
            System.out.println( " ");

        }
    }
}
