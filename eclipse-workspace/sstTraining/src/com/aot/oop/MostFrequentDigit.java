package com.aot.oop;

import java.util.Scanner;

public class MostFrequentDigit {
	public static void countDigits(int num,int freq[]) {
		if(num==0) {
			freq[0]++;
			return ;
		}
		num=Math.abs(num);
		
		while(num!=0) {
			int digit=num%10;
			freq[digit]++;
			num=num/10;
		}
	}
	public static int mostFrequentDigit(int input1,int input2,int input3,int input4) {
		
		int[] freq=new int[10];
		countDigits(input1,freq);
		countDigits(input2,freq);
		countDigits(input3,freq);
		countDigits(input4,freq);
		
		int maxFreq=0;
		int resultDigit=0;
		
		for(int i=0;i<10;i++) {
			if((freq[i]>maxFreq)||((freq[i])==maxFreq)&&(i>resultDigit)) {
				
				maxFreq=freq[i];
				resultDigit=i;
			}
		}
		return resultDigit;
		
	}
	public static void main(String[] args) {
		Scanner  sc =new Scanner(System.in);
		
		System.out.println("Enter first input#:");
		int input1=sc.nextInt();
		
		System.out.println("Enter second input#:");
		int input2=sc.nextInt();
		
		System.out.println("Enter third input#:");
		int input3=sc.nextInt();

		System.out.println("Enter fourth input#:");
		int input4=sc.nextInt();
		
		System.out.println("The most frequent digit is:"+mostFrequentDigit(input1,input2,input3,input4));
		
		sc.close();
		
	}

}
