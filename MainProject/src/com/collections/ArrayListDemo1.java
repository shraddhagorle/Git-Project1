package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ram");
		list.add("shyam");
		list.add("Sita");
		list.add("Gita");
		//using iterator
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// using for-each loop
		
		for(String name:list) {
			System.out.println(name);
		}
				
	}

}
