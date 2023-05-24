package com.jsp_Array;

public class AddNo {

	public static void main(String[] args) {
		String s="123";
		char[]arr=s.toCharArray();
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
			sum-=48;
		}
		System.out.println(sum);
			
		}
		
	

}
