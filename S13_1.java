package com.april29;

class Value {
	public static int minValue(int[] arr) {
		int x = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] < x) {
				x = arr[i];
			}
		}
		return x;
	}
	public static int maxValue(int[] arr) {
		int y = arr[0];
		for (int e : arr) {
			if (e > y) {
				y = e;
			}
		}
		return y;
	}
}

public class S13_1 {
	public static void main(String[] args) {
		int[] array = new int[] {5,4,6,9,2,6,3,1};
		int a = Value.maxValue(array);
		int b = Value.minValue(array);
		System.out.println(a+", "+b);
	}
}
