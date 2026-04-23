package com.aot.oop;
import java.util.Scanner;

public class ArrayDecoding {
	public static int[] takeInput(int n, int[] encoded) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		n = sc.nextInt();
		encoded = new int[n];
		System.out.println("Enter the elements: ");
		for(int i =0; i<n;i++) {
			encoded[i]= sc.nextInt();
		}
		sc.close();
		return encoded;
	}
	
	public static int[] getOriginalArray(int[] encoded){
		int[] originalArray = new int[encoded.length];
		originalArray[encoded.length-1] = encoded[encoded.length-1];
		for(int i = encoded.length-2; i>=0; i--) {
			originalArray[i]=encoded[i]-originalArray[i+1];
		}
		return originalArray;
	}
	public static int[] getOutputs(int[] original) {
		int[] outputs = new int[2];
		for(int i=0;i<original.length; i++) {
			outputs[1] +=original[i];
		}
		outputs[0]=original[0];
		return outputs;
	}

	public static void main(String[] args) {
		int n = 0;
		int[] encoded = null;
		encoded=takeInput(n, encoded);
		int[] original = getOriginalArray(encoded);
		int[] outputs = getOutputs(original);
		System.out.println("1st element of the original array: "+outputs[0]);
		System.out.println("sum of element of the original array: "+outputs[1]);
	}

}
