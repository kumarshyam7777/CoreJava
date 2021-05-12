package typecasting;

public class ExplicitTypeCasting_2 {
    public static void main(String[] args) {
        short s = 12345;
        byte b = (byte) s;
        System.out.println("The byte value type conversion from short to byte " + b);
        char ch = (char) s;
        System.out.println("The char value type conversion from short to char:" + ch);



    }
}
