package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Deepesh");
		al.add("Afreen");
		al.add("Monika");
		al.add("DK");
		
		String name = al.get(0);
		System.out.println(name.toUpperCase());
		Iterator<String> li = al.iterator();
		
		while(li.hasNext()) {
			String s = li.next();
			System.out.println(s);
		}
		
		System.out.println("===================Using List iterator==============");
		
		ListIterator<String> l = al.listIterator();
		while(l.hasNext()) {
			String s = l.next();
			System.out.println(s);
		}
		
		System.out.println("============Using for each=======================");
		
		for(String n : al) {
			System.out.println(n);
		}
	}

}
