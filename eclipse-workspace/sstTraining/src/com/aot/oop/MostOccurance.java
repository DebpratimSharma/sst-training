package com.aot.oop;
import java.util.Scanner;
public class MostOccurance {
	
	public static void countDigits(int n, int[] frequency) {
		if(n == 0) frequency[0]++;
		while(n>0) {
			frequency[n%10]++;
			n/=10;
		}
	}
	
	public static int findMostOccurringDigit(int[] freq) {
		int maxOccIndex = 0;
		int maxFreq = -1;
		for(int i= freq.length-1; i>=0;i--) {
			if(maxFreq < freq[i]) {
				maxFreq = freq[i];
				maxOccIndex = i;
			}
		}
		return maxOccIndex;
	}
	
	public static int getMostOccurance(int... numbers) {
		int[] frequency = new int[10];
		
		for(int num: numbers) {
			countDigits(num, frequency);
		}
		
		return findMostOccurringDigit(frequency);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[4];
		for(int i = 0; i< 4; i++) {
			System.out.println("Enter number "+ i+1+":");
			num[i] = sc.nextInt();
		}
		int result = getMostOccurance(num[0], num[1], num[2], num[3]);
		System.out.println("Max came : "+result);
		sc.close();
	}

}
