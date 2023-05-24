package com.jsp_String_Program;

public class PrintCosecutiveChar {

	public static void main(String[] args) {
		String a="viveeeeek";
		int len=a.length()-1;
		int i=0;
		String s="";
		while(i<len) {
			if(a.charAt(i)==a.charAt(i+1)) {
				s=s+a.charAt(i++);
			}
			i++;
		}
System.out.println(s);
	}

}
