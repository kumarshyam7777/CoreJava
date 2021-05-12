package typecasting;

public class TypeConversionSystemAuto_1 {
    public static void main(String[] args) {
        byte b = 126;
        short s = b; // TypeConversion System done automatically
        System.out.println("The short and byte value is:" + s + "---" + b);
        int i = b;  // TypeConversion System done automatically
        System.out.println("The integer value is type conversion from byte to int : " + i);
        long l = b; // TypeConversion System done automatically
        System.out.println("The long value type conversion from byte to long: " + l);
        float f = b; // TypeConversion System done automatically
        System.out.println("The float value type conversion from byte to float: " + f);
        double d = b; // TypeConversion System done automatically
        System.out.println("The double value value type conversion from byte to double:" + d);
    }

}
