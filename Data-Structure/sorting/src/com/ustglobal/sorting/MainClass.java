package com.ustglobal.sorting;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Enter the Array");
		int a[] = readArr();
		System.out.println("Choose the sorting technique:");
		System.out.println("1.Bubble Sort");
		System.out.println("2.Quick Sort");
		System.out.println("3.Insertion Sort");
		System.out.println("4.Merge Sort");
		System.out.println("5.Selection Sort");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n) {
		case 1 : BubbleSort.bubbleSort(a);
			break;
		case 2 : QuickSort.quickSort(a, 0, a.length-1);
			break;
		case 3 : InsertionSort.insertionSort(a);;
			break;
		case 4 : 
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the lower index : ");
			int l = sc1.nextInt();
			MergeSort.mergeSort(a, l, a.length-1);
			break;
		case 5 : SelectionSort.selectionSort(a);
			break;
		}
		
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
}
