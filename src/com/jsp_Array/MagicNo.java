package com.jsp_Array;

public class MagicNo {

	public static void main(String[] args) {
		
		int rem;
		
		int a=3524;
				
		do {
			int sum=0;
			while(a>0) {
			
			rem=a%10;
		    sum=sum+rem;
			a=a/10;
			}
			a=sum;
			if(sum==1) {
				System.out.println("magicNumber");
				}
				
		}
		while(a>=9);
		
		
	}

}
