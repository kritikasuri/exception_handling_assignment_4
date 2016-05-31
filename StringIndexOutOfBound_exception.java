package com.acadgild.assignment.StringIndexOutOfBound.exception;

public class StringIndexOutOfBound_exception {
	
	public static void main(String[] args) {
		
		String str="kritika";
		System.out.println("The length of the string "+str+" is : "+str.length());
		char c = str.charAt(0);	
		
		try{	 
			 c = str.charAt(10);
			 System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e){
			  System.out.println("StringIndexOutOfBounds Exception occurred "+e);
		}
	}
}
