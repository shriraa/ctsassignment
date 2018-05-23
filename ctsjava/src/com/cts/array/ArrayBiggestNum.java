package com.cts.array;

public class ArrayBiggestNum {
	
	public Integer isBigInArray(int array[])
	{
		int max = 0;
		int arraylen=array.length;
		for(int i=0;i<arraylen;i++)
		{
			if(max < array[i])
			{
				max=array[i];
			}
		}
		return max;
	}
}
