package com.cts.java;

public class Grades {
	public String isgrade(int subject1,int subject2,int subject3) {
		int average;
		average=(subject1+subject2+subject3)/3;
		int average1;
		average1=average/10;
		switch(average1)
		{
		case 9:return "a+";
		case 8:return "a-"; 
		case 7:return "b";
		case 6:return "-b";
		case 5:return "f";
		}
		return null;
	}

}
