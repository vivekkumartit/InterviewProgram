package com.jsp_Array;

public class Array {

	public static void main(String[] args) {
//		int arr[]= {1,2,1};
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]);
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]);
//		}
		int []arr= {1,2,1};
		int[]b=new int[arr.length*2];
		for(int i=0;i<b.length;i++) {
			if(i<arr.length) {
				b[i]=arr[i];
			}
			else {
				b[i]=arr[i-arr.length];
			}
			
		}
		
			
		

	}

}
