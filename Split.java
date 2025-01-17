package com.String_Method;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "apple,banana,orange";
		String[] fruits = a.split(",");
		for (String fruit : fruits) {
		    System.out.println(fruit); 
		}

	}

}
