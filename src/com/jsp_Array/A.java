package com.jsp_Array;

public class A {
	static void copy(int []ar) {
		int []ar1=new int[2*ar.length];
		
		for(int i=0;i<ar1.length;) {
			for(int j=0;j<ar.length;) {
				ar1[i]=ar[j];
				i++;
				j++;
			}
			
		}
		for(int e:ar1)
		{
			System.out.print(e+" ");
		}
		
	}
public static void main(String[] args) {
	int[]ar= {1,2,3};
	copy(ar);
}
}