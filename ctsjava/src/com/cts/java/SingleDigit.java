package com.cts.java;

public class SingleDigit 
{
	public int sum(int num)
	{
		int addition=0,rem;
		while(num>0)
		{
			rem=num%10;
			addition=addition+rem;
			num=num/10;
		}
		return addition;
	}
}


