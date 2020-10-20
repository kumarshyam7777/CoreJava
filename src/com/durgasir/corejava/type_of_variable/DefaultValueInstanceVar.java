package com.durgasir.corejava.type_of_variable;

public class DefaultValueInstanceVar {
    int x;
    float f;
    double d;
    String s;

    public static void main(String[] args) {
        DefaultValueInstanceVar df = new DefaultValueInstanceVar();
        System.out.println("The default value of integer x : " + df.x);
        System.out.println("The default value of float f : " + df.f);
        System.out.println("The default value of double d : " + df.d);
        System.out.println("The default value of String  s : " + df.s);
    }

}