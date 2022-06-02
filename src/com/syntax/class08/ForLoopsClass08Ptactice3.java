package com.syntax.class08;

import java.util.Scanner;

public class ForLoopsClass08Ptactice3 {

	public static void main(String[] args) {
		
		int sum=0;
		System.out.println(sum);//0 1 3 6 10
		for(int i-1; i<6; i++) {
			
			sum+-i;
			//System.out.println(sum);	//1 3 6 10 15
		}
System.out.println(sum);//print 15
	}

	/*
	 * write a program to find sum of all even and all odd numbers
	 * from 1 to 70
	 */
}
    int sum1 = 0;
    
    for(int i=1; i<70; i++) {
    	if  ( 1 % 2);
	sum+i;
	System.out.println(sum);
	System.out.println();
}
    //Another way 
    
    int sumEven=0;
    int sumOdd=0;
    
    
    /*
     * declare a secret number;
     * 
     * you want to ask user to guess your secret number
     * you code should keep asking to guess until user gets your secret number
     * Once user gets the secret numbers -> you got it!
     * 
     * 
     * 
     */
    //when to use whileLoop
    	 
    int secretNum= 1;
    int guessedNum;
		   
    Scanner scan = new Scanner (System.in);
    
    do {
    System.out.println("Guess my secret number");
    guessedNum=scan.nextInt();
    }while (guessedNum != secretNum);
    
    system.out.println("You got it");
		   
    