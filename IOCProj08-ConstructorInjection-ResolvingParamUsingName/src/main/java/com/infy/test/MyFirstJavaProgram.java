package com.infy.test;

public class MyFirstJavaProgram {
	
	public static void main(String args[]) {
		System.out.println("HelloWorld");
		MySecondJavaProgram obj1 = new MySecondJavaProgram("Dhas");
		System.out.println(obj1.showDetails());
	}

}

class MySecondJavaProgram {

	public MySecondJavaProgram() {
		System.out.println("MySecondJavaProgram :: 0 - param constructor");
	}

	public MySecondJavaProgram(String surname) {
		System.out.println("MySecondJavaProgram :: 1 - param constructor " + surname);
	}

	public String showDetails() {
		return "Rutuja";
	}
}