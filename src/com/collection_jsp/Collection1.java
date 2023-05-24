package com.collection_jsp;

import java.util.ArrayList;



public class Collection1 {

	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(5);
		al.add(9);
		al.add(5);
		al.add(3);
		int size=al.size();
		System.out.println(al);
		
		for(int i=0;i<size;i++) {
			
			
			System.out.println(al.indexOf(5));
			}
			
		}
		
		
		
		
		

	}
	


