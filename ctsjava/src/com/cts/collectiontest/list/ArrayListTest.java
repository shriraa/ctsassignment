package com.cts.collectiontest.list;
import java.util.*;
public class ArrayListTest {
	public void displayListUsingEnhancefor(List list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

	public void displayListUsingfor(List list) {
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
	}

	public void displayListUsingIterator(List list) {
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public boolean searchInt(List<Integer> list,Integer id) {
		for(Integer s:list)
		{
			if(s.equals(id))
				return true;
		}
		return false;
	}
	public boolean isPresentString(List<String> list,String name) {
		for(String s :list) {
			if(s.equals(name))
				return true;
		}
		return false;
	}
	public int getPosition(List list,String name) {
		int index=list.indexOf(name);
		if(index==-1)
		{
			return 0;
		}
		else
			return index-1;
	}
	public String getStringGivingPostion(List list,int pos) {
		int count=1;
		Iterator it = list.iterator();
		while(it.hasNext()) {
			if(count==pos) {
				return (String) it.next();
			}
			else 
				count++;
				it.next();
				
		}
		return null;
	}
	
	public static void main(String[] args) {
		ArrayListTest intergerList = new ArrayListTest();

		ArrayList<String> obj = new ArrayList<String>();

		obj.add("shri");
		obj.add("ram");
		obj.add("Chaitanya");
		obj.add("whatson");
		obj.add("Arjun");
		Collections.sort(obj);
		intergerList.displayListUsingEnhancefor(obj);

		intergerList.displayListUsingIterator(obj);
		
		System.out.println(intergerList.isPresentString(obj, "ADD"));
		
		System.out.println(intergerList.getPosition(obj, "Anuj"));
        //getElement giving by the Position
		System.out.println(intergerList.getStringGivingPostion(obj, 3));
		System.out.println("Currently array list" + obj);

		/* Add element at the given index */
		obj.add(0, "Rahul");
		obj.add(1, "Justin");

		/* Remove elements from array list like this */
		obj.remove("Chaitanya");
		obj.remove("Harry");

		System.out.println("Current array list " + obj);

		/* Remove element from the given index */
		obj.remove(1);

		System.out.println("Current array list" + obj);		
		}
}
