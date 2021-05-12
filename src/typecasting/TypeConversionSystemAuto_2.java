package typecasting;

public class TypeConversionSystemAuto_2 {
    public static void main(String[] args) {
        short s = 12754;
        int i = s; // System converts automatically
        System.out.println("the integer value is type conversion from short to int: " + i);
        long l = s;
        System.out.println("The long value is type conversion from short to long:" + l);
        float f = s;
        System.out.println("The float value type conversion from short to float: " + f);
        double d = s;
        System.out.println("The double value type conversion from short to double: " + d);

    }
}
