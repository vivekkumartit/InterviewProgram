package com.searching_program;

public class LinearSearch {
	public static void main(String[] args) {
		int[]arr= {1,4,675,4};
		System.out.println(search(arr,9));

	}
	public static int search(int[]arr,int search) {
		for(int i=0;i<arr.length;i++) {
			if(search==arr[i])return i;
		}
		return -1;
	}

}
