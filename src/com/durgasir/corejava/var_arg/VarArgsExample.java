package com.durgasir.corejava.var_arg;

public class VarArgsExample {

	public static void methodOne(int... x) {

		System.out.println("the no of arguments: " + x.length);
	}

	public static void main(String[] args) {

		methodOne();
		methodOne(10);
		methodOne(10, 20);
		methodOne(10, 20, 30);

	}

}
