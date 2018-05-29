package com.cts.string.test;

import com.cts.strinng.StringPrograms;

public class StringProgramsTest {
	public static void main(String[] args) {
		// Compare Two String
		StringPrograms string = new StringPrograms();
		String s1= new String("Hello");
		String s2= new String("Hello");
		System.out.println(string.isEquals(s1,s2));
		System.out.println(string.isEquals("shriraam's laptop ", "shriraam's laptop "));
		System.out.println(string.isEquals("shriraam's laptop ", "shriraam's laptop"));
		System.out.println(string.removeExtraSpace("My  Name is shriraam."));
	
	}
}



