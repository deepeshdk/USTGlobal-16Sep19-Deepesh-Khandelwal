package com.ustglobal.beanobject.bean;

public class DataBaseEmp {

	void receive(Employee e) {
		System.out.println("Id is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("Department is "+e.getDept());
		System.out.println("Designation is "+e.getDesignation());
		System.out.println("------------------");
	}
}