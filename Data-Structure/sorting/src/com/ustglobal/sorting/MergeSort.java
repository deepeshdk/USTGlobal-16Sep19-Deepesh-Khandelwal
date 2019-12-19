package com.ustglobal.sorting;

import java.util.Scanner;

public class MergeSort {

	static void mergeSort(int ar[],int l,int h)
	{
		if(l<h)
		{
			int m = (l+h)/2;
			mergeSort(ar, l, m);
			mergeSort(ar, m+1, h);
			merge(ar, l, m, h);
		}
	}
	static void merge(int[] ar, int l, int m, int h) 
	{
             int a[] = new int [m-l+1];
             int b[] = new int [h-m];
             for (int i = 0; i <=m; i++) 
             {
				a[i] = ar[l+1];
             }
				for (int i = 0; i <=h-m; i++) 
				{
				b[i] = ar[m+i+1];
				}
				int i = 0,j = 0;
				while(i<a.length && j<b.length)
				{
					if(a[i]<b[j])
						ar[l++] = a[i++];
						else
							ar[l++] = b[j++];
			}
			while(i<a.length)
			{
				ar[l++] = a[i++];
			}
			while(j<b.length)
			{
				ar[l++] = b[j++];
			}
	}
	
}
