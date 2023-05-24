package com.practice;

public class BiggestPallindromeString {
	public static void main(String[] args) {
		//System.out.println(isPallindrome("mata"));
		String s="malayalam";
		String biggestPallindrome="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(isPallindrome(s,i,j)) {
					String temp=s.substring(i,j+1);
					if(temp.length()>biggestPallindrome.length()) {
						biggestPallindrome=temp;
								}
				}
			}
		}
		System.out.println(biggestPallindrome);
		
	}
	
	public static boolean isPallindrome(String s,int start,int end) {
		int i=start;
		int j=end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
