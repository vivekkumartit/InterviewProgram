package com.jsp_Array;

public class Prabh {

	public static void main(String[] args) {
		String s="my name is prahaladcha";
		String []arr=s.split(" ");
		int len=arr.length-1;
		for(int i=len;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
