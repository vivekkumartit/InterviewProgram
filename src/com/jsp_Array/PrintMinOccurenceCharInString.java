package com.jsp_Array;

public class PrintMinOccurenceCharInString {

	public static void main(String[] args) {
		String s1="i need to go for my native";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			for(int j=0;j<s1.length();j++) {
				if(c==s1.charAt(j)) {
					count++;
					System.out.println(c+"="+count);
				}
				
			}
			
		}
		
	}

}
