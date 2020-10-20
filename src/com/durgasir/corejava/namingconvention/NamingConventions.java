package com.durgasir.corejava.namingconvention;

public class NamingConventions {
	

	NamingConventions(int x, int y) {

		System.out.println(x + y);
		System.out.println("The Constructor is called when object has created ");

	}

	public static void main(String[] args) {
		int result = sum(10, 20);
		System.out.println("The sum of 2 nos : " + result);
		NamingConventions nc = new NamingConventions(12, 13);
		nc.show();

	}

	public static int sum(int num1, int num2) {
		return num1 + num2;

	}

	public void show() {
		System.out.println("Instance level method");
	}

}
