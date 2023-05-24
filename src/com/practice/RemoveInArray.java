package com.practice;

public class RemoveInArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,3,2};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) a[j]=-1;
				
			}
	}
//			for(int b=0;b<a.length;b++) {
//				if(a[i]!=0) {
//					System.out.println(a[b]);
//				}
			
			//}	


			for(int n:a) {
				if(n!=-1) System.out.println(n);

			}
		}
}


