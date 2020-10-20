package com.durgasir.corejava.type_of_variable;

public class InstanceVarEx {
    int i = 10;

    public static void main(String[] args) {
        InstanceVarEx ine = new InstanceVarEx();
        System.out.println(ine.i);
        System.out.println(InstanceVarEx.class);
        ine.methodOne();

    }

    public void methodOne() {
        System.out.println("The instance variable value from a instance method: " + i);
    }

}