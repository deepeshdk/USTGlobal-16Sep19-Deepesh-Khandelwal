package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Deepesh");
		hs.add("DK");
		hs.add("Deepu");
		hs.add("Dev");
		hs.add("Deepak");
		
		System.out.println("************Using for each********");
		
		for(String s : hs) {
			
			System.out.println(s);
		}
		
		System.out.println("*********using iterator**********");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			
			String s = it.next();
			System.out.println(s);
		}
	}

}
