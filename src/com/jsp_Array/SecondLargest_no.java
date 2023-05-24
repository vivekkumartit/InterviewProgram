package com.jsp_Array;

import java.util.Scanner;

public class SecondLargest_no {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array sizes");
				int a=sc.nextInt();
				int[]arr=new int[a];

		for(int i=0;i<=a-1;i++) {
			System.out.println("enter the value");
			arr[i]=sc.nextInt();
			
		}
		for(int i:arr)System.out.println(i);
		second(arr);
		
	}
	public static void second(int[]a) {
		 int largest = a[0]; 
		    int second_largest = a[0]; 
		 
		    for (int i = 1; i <=a.length-1; i++) { 
		        if (a[i] > largest) { 
		            second_largest = largest; 
		            largest = a[i]; 
		        } 
		        else if (a[i] > second_largest && a[i] != largest) { 
		            second_largest = a[i]; 
		        } 
		
		
		
		
	}
			System.out.println("second largest no"+second_largest);
  }
}


