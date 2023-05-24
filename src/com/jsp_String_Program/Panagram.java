package com.jsp_String_Program;

public class Panagram {

	public static void main(String[] args) {
    String s="abcdefghijklmnopqrstuvwxyz";
  System.out.println(panagram(s));  

	}
	public static boolean panagram(String s) {
		for(char i='a';i<'z';i++) {
			if(s.indexOf(i)==-1) return false;
		}
		return true;
	}

}
