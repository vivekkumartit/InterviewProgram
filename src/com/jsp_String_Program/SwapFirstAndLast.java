package com.jsp_String_Program;

public class SwapFirstAndLast {

	public static void main(String[] args) {
		String s="vivek";
		System.out.println(swap(s));

	}
	
	public static String swap( String s) {
		char[]arr=s.toCharArray();
		int i=0; int j=arr.length-1;
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;		
		return new String(arr);
	}

}
