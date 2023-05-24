package com.jsp_String_Program;

public class ReplaceStringWithoutUsingReplaceMethod {

	public static void main(String[] args) {
		String s1 ="java";
		String res="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a') {
				res=res+"@";
			}else {
				res=res+s1.charAt(i);
			}
		}
		System.out.println(res); 
	}

}
