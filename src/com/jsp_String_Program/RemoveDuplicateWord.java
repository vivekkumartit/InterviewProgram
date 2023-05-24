package com.jsp_String_Program;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
	String s1="java is a java still it is a java";
	String newStr[]=s1.split(" ");
	for(int i=0;i<=newStr.length-1;i++) {
		for(int j=i+1;j<=newStr.length-1;j++) {
			if(newStr[i].equals (newStr[j])) {
				newStr[j]="0";
			}
		}
	}
for(int i=0;i<=newStr.length-1;i++) {
	if(newStr[i]!="0") {
	System.out.println(newStr[i]);
	}
  }
}

}
