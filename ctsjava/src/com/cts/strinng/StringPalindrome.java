package com.cts.strinng;

public class StringPalindrome {
	public boolean isStringPalindrome(String str)
	{
		int len=str.length();
		
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i)!=str.charAt(len-(i+1)))
			{
				return false;
			}
		
		
		}	
		return true;
		
	}


}
