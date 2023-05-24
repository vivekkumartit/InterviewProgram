package com.jsp_Array;

import java.util.Arrays;

public class Panagram {

	public static void main(String[] args) {
		String s="a quick brown fox jumps over the lazy dog";
		isPanagram(s);
		

	}
	public static void isPanagram(String s1) {
		String newStr=" ";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z'){
				newStr=newStr+s1.charAt(i);
			}
		}
		System.out.println(newStr);
	}

}
