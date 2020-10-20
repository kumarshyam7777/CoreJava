package com.durgasir.corejava.type_of_variable;

public class StaticVariable {

    int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        StaticVariable stv = new StaticVariable();
        System.out.println("The value of instance variable: " + stv.x);
        System.out.println("The value of static variablr :" + y);
        stv.methOne();
    }

    public void methOne() {
        System.out.println(StaticVariable.y);
    }

}