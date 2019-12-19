package com.ustglobal.sorting;

import java.util.Scanner;

public class BinarySearch {

	static int binarySearch(int ar[],int l,int h,int ele)
	{
		if(l>h)
			return-1;
		int mid = (l+h)/2;
		if(ar[mid]==ele)
		return mid;
		if(ar[mid]>ele)
			return binarySearch(ar, l, mid-1, ele);
		else
			return binarySearch(ar, mid+1, h, ele);
	}
	static int [] readArr()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		int n = sc.nextInt();
		int [] ar = new int[n];
	    System.out.println("Enter the "+n+" Sorting values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	static void displayArr(int [] ar) 
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]);
			if(i<ar.length-1)
				System.out.print(",");
		}
		System.out.println();
	}
public static void main(String[] args) 
{
    System.out.println("Enter the Array");
	int a[] = readArr();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the element :");
	int ele = sc.nextInt(); 
	 int b = binarySearch(a, 0, a.length, ele);
	 System.out.println("Index of the Search Element is : "+b);
}
}
