package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop> {
	
	double price;
	int ram;
	String name;
	
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}

	/*
	 * @Override public int compareTo(Laptop l) { if(this.ram > l.ram) {
	 * 
	 * return 10; } else if(this.ram < l.ram) {
	 * 
	 * return -1; } else {
	 * 
	 * return 0; } }
	 */
	
	/*
	 * @Override public int compareTo(Laptop l) { if(this.price > l.price) {
	 * 
	 * return 10; } else if(this.price < l.price) {
	 * 
	 * return -1; } else {
	 * 
	 * return 0; } }
	 */
	
	@Override
	public int compareTo(Laptop l) {
		
		String s = this.name;
		String s1 = l.name;
		
		return s.compareTo(s1);
	}
}
