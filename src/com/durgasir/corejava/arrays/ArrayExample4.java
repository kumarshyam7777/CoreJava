package com.durgasir.corejava.arrays;

public class ArrayExample4 {

	public static void main(String[] args) {
		int[][] x = new int[2][];
		x[0] = new int[3];
		x[1] = new int[2];
		x[0][0] = 10;
		x[0][1] = 20;
		x[0][2] = 30;

		x[1][0] = 40;
		x[1][1] = 50;

		System.out.println(x);
		System.out.println(x[0][0]);
		System.out.println(x[0][1]);
		System.out.println(x[0][2]);

		System.out.println(x[1][0]);
		System.out.println(x[1][1]);

	}

}
