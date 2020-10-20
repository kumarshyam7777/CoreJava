package com.durgasir.corejava.arrays;

public class ArrayExample {

	public static void main(String[] args) {

		// integer array of one dimension
		int[] a = new int[3];
		// to see the corresponding className of created array
		System.out.println(a.getClass().getName());

		// integer array of 2 dimension
		int[][] x = new int[3][2];
		// to see the corresponding className of created array
		System.out.println(x.getClass().getName());

		// double array of 3 dimensions
		double[][] d[] = new double[3][4][];
		// to see the corresponding className of created array
		System.out.println(d.getClass().getName());

		String[][] s = new String[6][3];
		System.out.println(s.getClass().getName());

		byte[] b[] = new byte[2][3];
		System.out.println(b.getClass().getName());

		boolean[] b1 = new boolean[3];
		System.out.println(b1.getClass().getName());

		short s1[] = new short[2];
		System.out.println(s1.getClass().getName()); 

	}

}
