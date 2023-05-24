package com.practice;

public class RemoveDuplicateInString {
	public static void main(String[] args) {
		String s="jaVagdudffsn";
		System.out.println(remove(s));
	}
	static String remove(String s) {
		String s1=s.toLowerCase();
		String s2="";
		for(int i=0;i<s.length();i++) {
			char c=s1.charAt(i);
			if(s2.indexOf(c)==-1) s2+=c;
		}
		return s2;
	}
	
	

}
