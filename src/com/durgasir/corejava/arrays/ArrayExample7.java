package com.durgasir.corejava.arrays;

public class ArrayExample7 {

	public static void main(String[] args) {
		int[][] x = new int[6][3];
		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println(x[1].length);
      System.out.println(x[0].length+x[1].length);
      for(int i=0;i<x.length;i++) {
    	  System.out.println(x[i]);
      }
	}

}
