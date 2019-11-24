package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestA {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		Student s = new Student(1, "Deepesh", 86.20);
		Student s1 = new Student(3, "DK", 86.17);
		Student s2 = new Student(2, "Deepu", 82.90);
		Student s3 = new Student(4, "Dev", 88.88);
		Student s4 = new Student(5, "dev", 88.88);


		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("Before sorting-----");
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("After sorting------");
		displayStudentDetails(al);
		
	}
	static void displayStudentDetails(ArrayList<Student> al) {
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.perc);
			
			System.out.println("===================");

		}
	}


}
