package com.jsp_String_Program;

import java.util.Scanner;

public class CHECK_WHETHER_GIVENSTRINGPALLINDROME {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		System.out.println(isPallindrome(s));

	}
	public static boolean isPallindrome(String s) {
		char[]c=s.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<j) {
		if(c[i]!=c[j])return false;
		i++;
		j--;
		}
		return true;
		
	}

}
