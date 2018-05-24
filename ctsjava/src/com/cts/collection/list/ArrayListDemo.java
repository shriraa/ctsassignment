package com.cts.collection.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo {
	public void displayListUsingEhancedForLoop(ArrayList<Comparable> list)
	{
		for(Object obj : list)
		{
			System.out.println(obj);
		}
	}
	public void displayListUsingForLoop(List list)
	{
		int i = 0;
		System.out.println(list.get(i));
		
	}
	public void displayListUsingForIterator(List list)
	{
		Iterator it = list.iterator();
		while(it.hasNext())
		System.out.println(it.next());
		
	}
	
	public static void main(String[] args) {
		ArrayListDemo listDemo = new ArrayListDemo();
		ArrayList<Comparable> integerList = new ArrayList<Comparable>();
		integerList.add(20);
		integerList.add(10);
		integerList.add(50);
		listDemo.displayListUsingEhancedForLoop(integerList);
		ArrayList<Comparable> StringList = new ArrayList<Comparable>();
		StringList.add("Shriraam");
		StringList.add("Abinandhan");
		StringList.add("Antony");
		listDemo.displayListUsingEhancedForLoop(StringList);
		
	}
}


