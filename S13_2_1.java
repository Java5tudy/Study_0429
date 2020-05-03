package com.april29;

import java.util.*;

public class S13_2_1 {
	public static void addOneDArr(int[] arr, int add) {
		for(int i = 0; i<arr.length;i++) {
			arr[i] += add;
		}
	}
	public static void addTwoDArr(int[][] arr, int add) {
		for(int j = 0; j<arr.length; j++) {
			addOneDArr(arr[j],add);
			System.out.println(Arrays.toString(arr[j]));
		}
	}
	public static void main(String[] args) {
		int[][] a = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		addTwoDArr(a,8);
	}

}
