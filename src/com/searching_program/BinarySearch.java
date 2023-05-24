package com.searching_program;

public class BinarySearch {
	public static void main(String[] args) {
		int[]arr= {1,4,5,7,8,9};
		System.out.println(search(arr,9));

	}
	public static int search(int[]arr,int search) {
		int first=0,last=arr.length-1;
		
		while(first<=last) {
			int mid=((first+last)/2);
			if(search==arr[mid])return mid;
			else if(search>mid)first=mid+1;
			else last=mid-1;
		}
		return -1;
	}

}
