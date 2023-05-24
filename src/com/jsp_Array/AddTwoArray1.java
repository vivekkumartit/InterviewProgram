package com.jsp_Array;

public class AddTwoArray1 {

	public static void main(String[] args) {
		int[]arr1= {1,2,3,4,5};
		int[]arr2= {1,2,3,4,5};
		int[]arr3=new int[arr1.length*2];
		add(arr1,arr2,arr3);

	}
	
	public static void add(int[]a1,int[]a2,int newArray[]) {
		int len1=a1.length;
		for (int i = 0; i < a1.length; i++) {
			newArray[i] = a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			newArray[len1++] = a2[i];
		}
		for(int a:newArray) {
			System.out.println(a);
		}	
		
	}

}
