package com.durgasir.corejava.var_arg;

public class VarArgsSumExample {

	public static void main(String[] args) {
		sum();
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);

	}

	public static void sum(int... x) {
		int total = 0;
		for (int x1 : x) {
			total = total + x1;
		}
		System.out.println("Array internally class:" + x + "\n");

		System.out.println("The sum is: " + total);

	}

}
