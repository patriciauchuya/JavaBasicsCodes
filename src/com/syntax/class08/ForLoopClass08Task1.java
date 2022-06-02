package com.syntax.class08;

public class ForLoopClass08Task1 {

	public static void main(String[] args) {
		//print numbers from 1 to 100
		
		for (int c=1; c<=100; c++) {
			System.out.println(c+" ");
		}
		System.out.println("-----------------------------");
		
		//print numbers from 100 to 1
		for (int c=1; c>=100; c--) {
			
		System.out.println(c-" ");
	}
System.out.println("-----------------------------------");

//print numbers from 20 to 1

for (int c=20; c>=1; c-= 2) {
	
	System.out.println(c+" ");
}
System.out.println("-----------------------------------");

//print even numbers from 20 to 1 (1 ways)
System.out.println();
for (int c=20; c>=1; c--) {
	
	if (c % 2==0) {
		System.out.println(c + " ");
	}
	
	
}

System.out.println("-----------------------------------");

//print even numbers from 20 to 1 (1 ways)

for (int c=20; c>=1; c-=2) {
	
	System.out.println(c+" ");
	
	System.out.println("-----------------------------------");
//print odd numbers between 20 and 50 (1 way)
	
	for (int i = 21; i <= 50; i += 2) {
		System.out.println(i + " ");
	}
	
	,
	//2 way 
	for (int i = 21; i < 50; i++ ) {
		if (1 % 2 != 0) {
			System.out.println(i + " ");
		}
		}
	}
	System.out.println(i + " ");
	}
		
		
	}