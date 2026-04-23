package com.aot.stringCodes;

public class FindsStringCodes {
	
	public static int findStringCode(String input) {
		int output = 0;
		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();	//Better than StringBuffer
		for(String word: words) {
			int temp = calculateWordSum(word); //40 23 26
			result.append(temp); //402326
		}
		output = Integer.parseInt(result.toString());
		return output;
	}
	
	public static int calculateWordSum(String word) {
		
		word = word.toUpperCase(); //example : WORD
		int left=0; //left index value is 0
		int right = word.length()-1; // right index value is 4
		int sum =0;
		while(left<right) {
			int leftValue = word.charAt(left)-'A'+1;
			int rightValue = word.charAt(right)-'A'+1;
			sum += Math.abs(leftValue-rightValue);
			left++;
			right --;
		}
		if(left == right)
			sum+= word.charAt(left)-'A'+1;
		return sum; //40 23 26
	}

	public static void main(String[] args) {
		String input = "World Wide Web";
		int result = findStringCode(input);
		System.out.println("Output is : "+result);
	}

}
