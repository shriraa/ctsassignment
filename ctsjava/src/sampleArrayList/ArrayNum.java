package sampleArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayNum 
{
	
	public void displayInArrayListWithEnhancedFor(List list)
	{
		for(Object obj: list)
		{
			System.out.println(obj);
		}
	}
	
	
	public void displayInArrayListWithIterator(List list)
	{
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	
	public void displayInArrayListWithFor(List list)
	{
		int size = list.size(); 
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
	
		for(int i=0;i<size;i++)
		{
			System.out.println(list.get(i));;
		}
	
	}
	
	
}