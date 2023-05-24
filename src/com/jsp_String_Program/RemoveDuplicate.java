package com.jsp_String_Program;

public class RemoveDuplicate {

	public static void main(String[] args) {
	String s1="mahaharat";
	char[]s2=s1.toCharArray();
	int len=s2.length;
	for(int i=0;i<len-1;i++) {
		for(int j=i+1;j<len-1;j++) {
			if(s2[i]==(s2[j])) {
			s2[j]='0';	
			}
		}
	}

	for(int i=0;i<len-1;i++) {
		if(s2[i]!='0') {
		System.out.println(s2[i]);
		}
	}
	}

}
