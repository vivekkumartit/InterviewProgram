package com.jsp_String_Program;

public class Anagram {
	public static void main(String[] args) {
		String s1="silent";
		String s2="silent";
		System.out.println(anagram(s1,s2));
	}
	public static boolean anagram(String s1,String s2) {
		while(true) {
			if(s1.length()!=s2.length()) return false;
		
			char ch=s1.charAt(0);
			s1=s1.replace(ch+"", "");
			s2=s2.replace(ch+"", "");
			if(s1.length()==0&&s2.length()==0)return true;
		}
	}

}
