package com.jsp_Array;

import java.util.Scanner;

public class MaxNumber {
	
	public  void max(int[]a) {
		int max=0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)max=a[i];
		}
		System.out.println("Max no is = "+max);
	}
	public static void main(String[] args) {
		int[]arr= new int[6];
		for(int i=0;i<arr.length;i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the no");
			arr[i]=scanner.nextInt();		}
		
		MaxNumber maxNumber = new MaxNumber();
		maxNumber.max(arr);

	}

}
