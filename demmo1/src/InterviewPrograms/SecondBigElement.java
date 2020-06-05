package InterviewPrograms;

import java.util.Scanner;

public class SecondBigElement{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the Array : ");
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int a = getFirstMax(arr);
		System.out.println("First Max Element : "+ a);
		
		int b = getSecondMax(arr, a);
		System.out.println("Second Max Element : "+ b);
		
	}
	
	public static int getFirstMax(int[] a) {
		int maxValue = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>maxValue) {
				maxValue = a[i];
			}
		}
		return maxValue;
	}
	
	public static int getSecondMax(int[] a, int b) {
		int smaxValue = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>smaxValue && a[i] != b ) {
				smaxValue = a[i];
			}
		}
		return smaxValue;
	}
} 