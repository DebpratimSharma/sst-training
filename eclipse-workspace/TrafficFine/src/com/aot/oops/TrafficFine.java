package com.aot.oops;
import java.util.Scanner;
public class TrafficFine {
	
	public static int calculateFine(int arr[], int date, int x ) {
		int fine = 0;
		if(date%2 == 0) { //date is even. so odd cars will be fined
			for(int i = 0; i< arr.length; i++) {
				if(arr[i]%2 !=0)
					fine+=x;
			}
		}
		else {
			for(int i = 0; i < arr.length; i++)
				if(arr[i]%2 == 0)
					fine+=x;
		}
		return fine;
	}

	public static void main(String[] args) {
		
		//taking input
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of cars: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("Enter "+n+" digits");
		for(int i = 0; i < n ; i++)
			a[i]= sc.nextInt();
		System.out.print("Enter the date: ");
		int d = sc.nextInt();
		System.out.print("Enter the Fine: ");
		int x = sc.nextInt();
		
		//calculate fine
		int fine = calculateFine(a, d, x);
		System.out.println("The fine is : "+fine);
		sc.close();
	}

}
