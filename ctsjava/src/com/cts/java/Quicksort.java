package com.cts.java;

public class Quicksort {
	public int[] toSort(int[] array)
	{
		int len=array.length;
		if((array != null)||(array.length != 0))
		{
			int i = array[0];
			int j = array[len-1];
			int k = i+(i+j)/2;
			int pivot = array[k];
			
			while(i <= j)
			{
				while(i<pivot)
				{
					i++;
				}
				while(j>pivot)
				{
					j--;
				}
				
				if(i<=j)
				{
					int swaper[];
					
					
					array[i]=array[i]+array[j];
					array[j]=array[i]-array[j];
					array[i]=array[i]-array[j];
					
					i++;
					j++;
				}
			}
			if(i < j)
			{
				QuickSort qs = new QuickSort();
				qs.toSort(i,j);
				
			}
			if()
		}
	}


}
