package InterviewPrograms;

import java.util.Scanner;

public class MaxMinElementSumOfArray {

	static int getMax(int inputArray[]) {
		int maxValue = inputArray[0];
		for(int i=1;i<inputArray.length;i++) {
			if(inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}
	
	static int minValue(int inputArray[]) {
		int minValue = inputArray[0];
		for(int i=1; i<inputArray.length;i++) {
			if(inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}
	
	public static void main(String[] args) {

		
		String [] number = new String[] {"1","3","8","4","15","9"};
		
 		int arr[] = new int[number.length];
		
		for(int i=0;i<number.length;i++)
		{
			arr[i]=Integer.parseInt(number[i]);
		}

		System.out.println("Maximum value is :" +getMax(arr));
		System.out.println("Minimum value is :" +minValue(arr));
		
		System.out.println("Sum of Max and Min value of Array is : "+ (getMax(arr)+minValue(arr)));
	}
	}


