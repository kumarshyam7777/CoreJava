package com.durgasir.corejava.string_concatenation;

public class ThreadEx {
    public static void main(String[] args) {
        Thread th = new Thread();
        Thread th2 = new Thread();
        Thread th3 = new Thread();

        th2 = th3;
        System.out.println(th2 == th3);
        // Thread Class Object reference and toString() method.
        System.out.println(th.toString());
        System.out.println(th);
        // To get the getClass() and getName()
        System.out.println(th.getName().getClass());

        System.out.println(th2);
        System.out.println(th2.getName().getClass());

        System.out.println(th3);

        System.out.println(th == th2);
    }

}