package com.jsp_Array;

public class FindTheDiagonal {

	public static void main(String[] args) {
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		int len=arr.length;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					System.out.println(arr[i][j]);
			}else {
					if((i+j==len-1)) {
						System.out.println(arr[i][j]);
					}
				}
			}
		}

	}
}


