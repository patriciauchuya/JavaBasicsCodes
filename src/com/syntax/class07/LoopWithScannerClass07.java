package com.syntax.class07;

public class LoopWithScannerClass07 {

	public static void main(String[] args) {
		
		/*
		 * we are going to ask you if you get a job until you say yes!
		 *//once you say yes-----> congratulations!
		 
		 
		 
		 Scanner scan=new Scanner(System.in);
		 String job;
		  
		 do {
		 System.out.println("Did you get a job?");
		 job=scan.nextLine();
		 
	     }while(!job.equalsIgnoreCase("yes"));
		 
		 System.out.println("Congratulation");
		 System.out.println("---------------------------------------------------------------------");
		 
		 Scanner input=new Scanner(System.in);
		 String offer;
		 
		 System.out.println("Did you get a job");
		 
		 while(!offer.equalsIgnoreCase("yes")) {
			 System.out.println("Did you get a job");
			 offer=input.nextLine();
		 }
		 System.out.println("Congratulations");
}
