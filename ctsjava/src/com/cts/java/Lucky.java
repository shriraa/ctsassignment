package com.cts.java;

public class Lucky {
	
	public int isluckynum(int number)
	{
		int rem,sum=0;
		while(number>0)
		{
			rem=number%10;
			sum=sum+rem;
			number=number/10;
			if(sum>9 & number<0)
			{
				number=sum;
				sum=0;
			}
		}
		return sum;
	}
		
}
