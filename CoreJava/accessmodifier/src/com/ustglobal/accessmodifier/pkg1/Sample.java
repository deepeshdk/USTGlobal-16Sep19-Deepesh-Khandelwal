package com.ustglobal.accessmodifier.pkg1;

import com.ustglobal.accessmodifier.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		
	Demo d = new Demo();
	//Private
	//System.out.println(d.a); private not visible
	//d.add();
	
	
		/*
		 * //Default 
		 * System.out.println(d.b); Not visible
		 * d.sub();
		 */
	Sample s = new Sample();

	//Protected
	System.out.println(s.d);
	s.mul();

	//Public
	System.out.println(d.name);
	d.div();
}
}