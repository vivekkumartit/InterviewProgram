package com.jsp_Array;

public class MultiplicationArray {
	public static void main(String[] args) {
		int [][]arr1= {{1,2,3},
			           {4,5,6},
	                   {7,8,9}};
	
	    int [][]arr2= {{1,2,3},
		               {4,5,6},
                       {7,8,9}};
	    int [][]c=multiply(arr1,arr2);
	    for(int i=0;i<c.length;i++) {
	    	for(int j=0;j<c.length;j++) {
	    		System.out.print(c[i][j]+"\t");
	    		}
	    	System.out.println();
	    }
	    
	}
	public static int [][] multiply(int[][]a,int[][]b) {
		int length = a.length-1;
		int[][]c=new int[length][length];
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				for(int k=0;k<length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}

}
