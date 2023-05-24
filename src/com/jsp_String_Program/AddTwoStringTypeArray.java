package com.jsp_String_Program;

public class AddTwoStringTypeArray {

	public static void main(String[] args) {
		String[] s1 = { "virat", "rohit", "rahul", "pujara", "jadeja" };
		String[] s2 = { "virat", "rohit", "ram", "puji", "jadu" };
		int len1 = s1.length;
		int len2 = s2.length;
		String[] s3 = new String[len1 + len2];
		String[] s4 = new String[len1 + len2];

		for (int i = 0; i < len1; i++) {
			s3[i] = s1[i];
		}
		for (int i = 0; i < s2.length; i++) {
			s3[len1++] = s2[i];
		}

		for (int i = 0; i < s3.length; i++) {

			if (s3[i] != s3[i + 1]) {
				s4[i++] = s3[i];
			}
		}

		for (int i = 0; i < s4.length; i++) {

			if (s4[i] != null)
				System.out.println(s4[i]);

		}
	}

}
