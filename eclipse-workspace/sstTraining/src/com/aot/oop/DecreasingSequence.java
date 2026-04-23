package com.aot.oop;
import java.util.Scanner;

public class DecreasingSequence {
	public static int[] findDecreasingSequence(int[] arr) {
		int count=0;
		int currentLength=1;
		int maxLength=0;
		int[] result = new int[2];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				currentLength++;
			}else {
				if(currentLength>1) {
					count++;
					maxLength=Math.max(currentLength,maxLength);
				}
				currentLength=1;
			}
		}
		
		if(currentLength>1) {
			count++;
			maxLength=Math.max(currentLength,maxLength);
		}

		System.out.println(count);
		System.out.println(maxLength);
		result[0]= count;
		result[1]= maxLength ;
			
		return result;
	
	}
	public static int[] inputArray(Scanner sc) {
		System.out.println("Enter no of elements:");
		int n=sc.nextInt();
		
		/* Create An array*/
		int[] arr=new int[n];
		
		System.out.println("Enter elements in array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=inputArray(sc);
		int[] result = findDecreasingSequence(arr);
		System.out.println("Number of Sequences: "+result[0]+"\nNumber of max length:"+result[1]);
	}

}
