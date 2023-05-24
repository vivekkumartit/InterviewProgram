package com.jsp_String_Program;

public class ReverseEachWord {
	public static void main(String[] args) {
	//System.out.println(rev("java"));	
		String s="java is oop lang";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length-1;i++) {
			System.out.println(rev(s1[i]));
		}
		
	}
	public static  String rev(String s) {
		char s1[]=s.toCharArray();
		int i=0;
		int j=s1.length-1;
		while(i<j) {
			char temp=s1[i];
			s1[i]=s1[j];
			s1[j]=temp;
			i++;
			j--;
		}
		
		return new String(s1);
	}

}
