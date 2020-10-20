package com.durgasir.corejava.string_concatenation;

public class ComparisonOperator {
    public static void main(String[] args) {
        System.out.println(10 < 10.5);
        System.out.println('a' > 95.5);
        System.out.println('z' > 'a');
        System.out.println(10 >= 10);
        //CompileTimeError:cannot be applied to java.lang.String,java.lang.String
        //System.out.println("ashok">"ashok");
       // System.out.println(10<20<30);

    }

}