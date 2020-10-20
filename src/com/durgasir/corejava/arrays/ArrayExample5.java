package com.durgasir.corejava.arrays;

public class ArrayExample5 {

	public static void main(String[] args) {
		int[][][] x = new int[2][][];
		x[0] = new int[3][];
		x[0][0] = new int[1];
		x[0][1] = new int[2];
		x[0][2] = new int[3];

		x[1] = new int[2][2];

		x[0][0][0] = 10;

		x[0][1][0] = 20;
		x[0][1][1] = 30;

		x[0][2][0] = 40;
		x[0][2][1] = 50;
		x[0][2][2] = 60;

		x[1][0][0] = 70;
		x[1][0][1] = 80;

		x[1][1][0] = 90;
		x[1][1][1] = 100;

		System.out.println(x[0][0][0] = 10);
		System.out.println(x[0][1][0] = 20);
		System.out.println(x[0][1][1] = 30);
		System.out.println(x[0][2][0] = 40);
		System.out.println(x[0][2][1] = 50);
		System.out.println(x[0][2][2] = 60);
		System.out.println(x[1][0][0] = 70);
		System.out.println(x[1][0][1] = 80);
		System.out.println(x[1][1][0] = 90);
		System.out.println(x[1][1][1] = 100);

		System.out.println(x);
		System.out.println(x[0] + "-------" + x[1]);
		System.out.println(x[0][0] + "------" + x[0][1] + "-------" + x[0][2]);
		System.out.println(x[1][0] + "------" + x[1][1]);

	}

}
