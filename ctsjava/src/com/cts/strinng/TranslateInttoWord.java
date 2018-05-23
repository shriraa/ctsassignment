package com.cts.strinng;

public class TranslateInttoWord {

	public String toTranslateToWord(int num)
	{
		switch(num)
		{
		case 0: return " ";
		case 1: return "One";
		case 2: return "Two";
		case 3: return "three";
		case 4: return "four";
		case 5: return "five";
		case 6: return "six";
		case 7: return "seven";
		case 8: return "eight";
		case 9: return "nine";
		default: return "zero";
		}
	}


}
