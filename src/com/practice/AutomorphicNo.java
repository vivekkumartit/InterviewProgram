package com.practice;

import java.util.Scanner;

public class AutomorphicNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");	
		int a=sc.nextInt();
		boolean b=atom(a);
		if(b) {
			System.out.println("atomorphic no");
		}
		else {
			System.out.println("not atomorphic no");
		}
		
	}
	public static boolean atom(int a) {
		int sq=a*a;
		while(a>0) { 
			if(a%10!=sq%10)return false;
			a/=10;
			sq/=10;
		}
		return true;
	}

}
