package com.execeptionhandling;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first no");
	int a=sc.nextInt();
	System.out.println("enter 2nd no");
	int b=sc.nextInt();
	try{
		int c=a/b;
		System.out.println(c);
		
	 }
	catch(ArithmeticException e) {
		 System.out.println(a+" con't devide by "+b);
	 }
	
	System.out.println("ended");
	System.out.println("ended");
	System.out.println("ended");
	System.out.println("ended");
	System.out.println("ended");
	

	}

}
