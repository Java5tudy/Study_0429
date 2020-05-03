package com.april29;

import java.util.*;

public class S13_2_2 {
	public static void main(String[] args) {
		int[][] a = new int[][] {{1,2,3},{4,5,6},{7,8,9},{11,12,13}};
		change(a);
		
	}
		public static void change(int[][] arr) {
		int a = arr.length;
		int b = arr[0].length;
		int[][] arr2 = new int[a][b];
		for(int i = 0; i<a; i++) {
				if (i+1 != a) {
					arr2[i+1]= arr[i];
					}	
				else {
					arr2[0] = arr[i];
				}	
			}
		System.out.println(Arrays.deepToString(arr2));		
		}
	}