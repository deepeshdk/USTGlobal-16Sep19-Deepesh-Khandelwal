package com.ustglobal.sorting;

import java.util.Scanner;

public class SelectionSort {

	static void selectionSort(int ar[])
	{
		for (int i = 0; i < ar.length; i++) 
		{
			int si = i;
			for (int j = i+1; j < ar.length; j++) 
			{
				if(ar[si]>ar[j])
				{
					si=j;
				}
				int t = ar[si];
				ar[si] = ar[i];
				ar[i] = t;
			}
		}
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println(ar[i]);
			
		}
	}

}
