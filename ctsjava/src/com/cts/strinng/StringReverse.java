package com.cts.strinng;
public class StringReverse {
	public String isStringReverse(String word)
	{
		String reverse = "";
				
		int i=0,len=word.length();
		
		for(i=len-1;i>=0;--i)
		{
			reverse = reverse + word.charAt(i);
		}
		
		return reverse;
	}

}
