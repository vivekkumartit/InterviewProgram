package com.jsp_Array;

public class AddTwo {

	public static void main(String[] args) {
		int[]arr= {1,2,3};
		int[]arr1=new int[arr.length*2];
		int len=arr.length-1;
		int len1=arr1.length-1;
		
		for(int i =0;i<=len1;) {
			for(int j=0;j<arr.length;) {
				arr1[i]=arr[j];
				i++;
				j++;
				
			}
			
		}
		for(int e:arr1) {
			System.out.println(e); 
		}

	}

}
