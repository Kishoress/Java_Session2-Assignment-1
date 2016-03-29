package Voter;

import java.util.Scanner;

public class Age {

	private static Scanner in;
	int a = 0;
    
	public static void main(String[] args) {
		    System.out.print("Age : ");
		    int a = in.nextInt();
		
	        if (a>=18){
	            System.out.println("You are Eligible to Vote");         
	        }else{
	           System.out.println("You are Not Eligible to Vote");  
	        }
	    }

	}

