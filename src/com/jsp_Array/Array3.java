package com.jsp_Array;

public class Array3 {

	public static void main(String[] args) {
		int[]arr= {1,2,1};
		
		int[]arr1=new int[arr.length*2];
		
		int j=arr.length;
		for(int i=0;i<j;i++) {
		if(i<j) {
			arr1[i]=arr[i];
			
		}else {
			arr1[++j]=arr[i];
		} 
		}
			
		
for(int n:arr1) {
	System.out.println(n);}


	}
	}


