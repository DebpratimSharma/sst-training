package com.aot.theory;

public class Box {
	//non static variables
	private double width;
	private double depth;
	private double height;
	
	public Box(double width,double depth,double height){
		this.width=width;
		this.depth=depth;
		this.height=height;
	}
	public double getVolume(){
		return width*depth*height;
	}
	
	public static void main(String[] args) {
		System.out.println("");
	}

}
