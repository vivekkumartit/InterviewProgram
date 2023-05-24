package com.jsp_Array;

public class MissingNoInGivenArray {

	public static void main(String[] args) {
		int []arr= {3,5,9};
		for(int i=0;i<arr.length-1;i++) {
			m22(arr[i],arr[i+1]);
		}
	}
	public static void m22(int a,int b) {
		for(int i=a+1;i<b;i++) {
			System.out.println(i);
		}
	}
}
