package com.jsp_Array;

public class AddTwoArray {

	public static void main(String[] args) {
		int[] arr1 = { 5, 2, 1, 9, 1 };
		int[] arr2 = { 2, 5, 1, 6, 2 };
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] arr3 = new int[len1 + len2];
		int[] arr4 = new int[len1 + len2];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[len1++] = arr2[i];
		}
		for (int a : arr3) {
			System.out.print(a+"");
		}
		
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] != arr3[i + 1]) {
				arr4[i++] = arr3[i];
			}
		}
//		for (int b : arr4) {
//			System.out.print(b);
//		}
		for(int i=0;i<arr4.length;i++) {
			if(arr4[i]!=0)System.out.println(arr4[i]);
		}
	}

}