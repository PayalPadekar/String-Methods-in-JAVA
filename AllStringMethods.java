package com.String_Method;

public class AllStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String a = " Programming";
			String b = " Language";
			
			System.out.println(a.charAt(5));  // index of char with add space index
			System.out.println(b.charAt(3));
			
			System.out.println(a.compareTo(b)); // same index same latter
			
			System.out.println(a.compareToIgnoreCase(b));
			
			System.out.println(a.concat(b)); // add both string
			
			System.out.println(a.contains(b));
			
			System.out.println(a.endsWith(b));
			
			System.out.println(a.equals(b)); 
			
			System.out.println(a.hashCode()); // unique code
			System.out.println(b.hashCode());
			
			System.out.println(a.indent(3)); //add Space
			System.out.println(b.indent(5)); 
			
			System.out.println(a.trim());  //remove space
			System.out.println(b.trim()); 
			
			System.out.println(a.indexOf(4));
			System.out.println(b.indexOf(2));
			
			System.out.println(a.length());  //length of string , start with 1 and add space
			System.out.println(b.length());
			
			System.out.println(a.repeat(3)); //repeat string .....times
			System.out.println(b.repeat(5));
			
			System.out.println(a.replaceFirst(a, b)); //replace string 
			System.out.println(b.replaceFirst(b, a));
			
			 
	}

}
