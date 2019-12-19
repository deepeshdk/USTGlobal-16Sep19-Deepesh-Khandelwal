package com.ustglobal.sorting;

import java.util.Scanner;

public class QuickSort {

	static void quickSort(int ar[],int l,int h)
	{
		int j = partition(ar,l,h);
		quickSort(ar, l, j-1);
		quickSort(ar, j+1, h);
		
	}
static int partition(int[] ar, int l, int h) 
{
	int p = ar[l];
	int i = l+1;
	int j = h;
	while(i<j)
	{
	while(ar[i]<p && i<h)
		i++;
	while(ar[j]>p)
		j--;
	if(i<j)
	{
		int t = ar[j];
		ar[i] = ar[j];
		ar[j] = t;
	}
	}
	ar[l] = ar[j];
	ar[j] = p;
		return j;
	}

}
