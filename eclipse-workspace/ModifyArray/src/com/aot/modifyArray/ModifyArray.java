package com.aot.modifyArray;
import java.util.Scanner;
public class ModifyArray {

	public static void main(String[] args) {
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//modify the array
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(n%2 == 0) {	//case 1 : even number length
				if(i%2 != 0) {
					sum+=arr[i];
				}
			}
			else {
				if(i%2 != 0) {
					sum+=1;
				}
				else {
					sum+=arr[i];
				}
			}
		}
		System.out.println("The result is : "+sum);
	}

}
