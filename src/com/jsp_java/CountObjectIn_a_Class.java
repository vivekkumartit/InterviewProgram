package com.jsp_java;

public class CountObjectIn_a_Class {
	static int count;
//	CountObjectIn_a_Class(){
//		count++;	
//	}
//	another way
	{
		count++;		
	}
	
	public void m1() {
		System.out.println("hiiiballayya");	
	}
	public static void main(String[] args) {
		CountObjectIn_a_Class ob1=new CountObjectIn_a_Class();
		CountObjectIn_a_Class ob2=new CountObjectIn_a_Class();
		CountObjectIn_a_Class ob3=new CountObjectIn_a_Class();
		System.out.println("no of object "+count);	
		
		
		
	}

}
