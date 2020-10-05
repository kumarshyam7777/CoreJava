public class Multiplication {
    public static void main(String[] args) {
        int x = 5;
        for(int i=1;i<=10;i++){
            System.out.println(x + "*" + i + "=" + x * i);
        }
        Multiplication multiplication = new Multiplication();
        multiplication.multiplicationTable(15);
    }
    void multiplicationTable(int x){

        for(int i=1;i<=10;i++){
            System.out.println(x + "*" + i + "=" + x *i);
        }

    }
}
