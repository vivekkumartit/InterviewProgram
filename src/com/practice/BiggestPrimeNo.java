package com.practice;

import java.util.Scanner;

public class BiggestPrimeNo {

	public static void main(String[] args) {
		//isPrime(5);
		Scanner o=new Scanner(System.in);
		System.out.println("first no");
		int a=o.nextInt();
		System.out.println("last no");
		int b=o.nextInt();
		int biggest=0;
       for(int i=a;i<=b;i++) {
    	   int m=isPrime(i);
    	 if(m>biggest)biggest=m;
       }
   System.out.println("Biggest prime no is "+biggest);
	}
	
	public static int isPrime(int a) {
		int count=0;
		int prime=0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0)
			count++;
			prime=i;
			
		}
		if(count==2) {
			System.out.println("prime no "+prime);
					}
		return prime;

	}

}
