package InterviewPrograms;

import java.util.Scanner;

public class SecondBigElement1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the Array : ");
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int maxValue = arr[0];
		int smaxValue = arr[0];
		for(int i=1 ;i<arr.length;i++) {
			
			if(arr[i] > maxValue) {
				smaxValue= maxValue;
				maxValue = arr[i];
			}
			else if(arr[i] > smaxValue) {
				smaxValue = arr[i];
			}
		}
		System.out.println("First Max element : "+maxValue);
		System.out.println("Second Max element : "+smaxValue);

	}

}
