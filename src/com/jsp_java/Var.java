package com.jsp_java;

public class Var {
	public static class Test1 {
		int num1=6;
		int num2=10;
		public static void main(String[] args) {
			Test1 s1 = new Test1();
			Test1 s2 = new Test1();
			s1.num1=15;
			
	        s1.num2=17;
	        s2.num1=22;
	        
			s2.num2=28;
			System.out.println(s1.num1+" "+ s1.num2+" "+ s2.num1+" "+s2.num2);
			

	}
		}

}
