package com.practice;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		//isPrime(5);
		Scanner o=new Scanner(System.in);
		System.out.println("first no");
		int a=o.nextInt();
		System.out.println("last no");
		int b=o.nextInt();
		int t=0;
       for(int i=b;i>=a;i--) {
    	  if(isPrime(i)) {
    		//  t++;
    		//  if(t==2) {
    		 System.out.println(i);
    	//	 break;
    		 // }
    	  } 
    	  
       }

	}
	
	public static boolean isPrime(int a) {
		int count=0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0)
			count++;	
		}
		if(count==2) {
			return true;	
		}
		//else System.out.println("not");
		return false;
	}
	

}
