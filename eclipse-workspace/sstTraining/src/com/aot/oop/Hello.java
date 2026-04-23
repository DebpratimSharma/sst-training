package com.aot.oop;
import java.util.Scanner;
 
public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello world");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Name is : "+name);
		sc.close();
	}
}
