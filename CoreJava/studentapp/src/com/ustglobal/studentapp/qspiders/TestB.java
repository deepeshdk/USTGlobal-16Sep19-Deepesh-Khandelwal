package com.ustglobal.studentapp.qspiders;

//import com.ustglobal.studentapp.jspiders.Remote; (For non-static)

import static com.ustglobal.studentapp.jspiders.Remote.*;

import com.ustglobal.studentapp.jspiders.*;

public class TestB {
	public static void main(String[] args) {
      // Remote.on();
      //System.out.println(Remote.num);
		on();
		System.out.println(num);
		
		Remote r = new Remote();
		System.out.println(r.sum);
	}
}
