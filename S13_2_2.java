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
		int[][] arr2 = new int[a][b]; // 대입하는 행렬의 크기 따왔음
		for(int i = 0; i<a; i++) {
				if (i+1 != a) { // 마지막 행과 같지 않을 경우 0번째 행부터 새로운 행렬의 1번째 행으로 옮겨줌
					arr2[i+1]= arr[i];
					}	
				else { // i가 a(마지막행)일 경우 대입행렬의 마지막 행을 새로운 행렬 1번째 행으로 옮겨줌
					arr2[0] = arr[i];
				}	
			}
		System.out.println(Arrays.deepToString(arr2));//행렬 출력 방법		
		}
	}
