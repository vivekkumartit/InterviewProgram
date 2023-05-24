package com.jsp_String_Program;

public class CountTheNoOfCharInString {

	public static void main(String[] args) {
		String s="asdfghjg";
		int len=s.length();
		int count=0;
		for(int i=0;i<len-1;i++) {
			count++;
		}
		System.out.println(count);
	}
	
}
