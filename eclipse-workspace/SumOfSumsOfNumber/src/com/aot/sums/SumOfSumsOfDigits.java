package com.aot.sums;
import java.util.Scanner;
public class SumOfSumsOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		String str = String.valueOf(n);
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum +=(i+1)*Character.getNumericValue(str.charAt(i));
		}
		System.out.println("The sum of the sums is : "+sum);

	}
	
}
