package com.syntacClass09;

public class ArrayClass09Intro {

	public static void main(String[] args) {
		// create an Array
		
		int[] b=new int[4];
		
		//store values
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		
		//access values from my array
		System.out.println(b[2]); //70
		
		System.out.println(b[1+b[3]]); //185
		
		// we need to create an array of my classmates names
		// when we created an array we Must specify the size (how many elements)
		String[] classmMtes=new String[5];
		//how values are stored--> store based on index
		classMates[0]="Khrystyna";
		classMates[1]="Zameer";
		classMates[2]="Elexxia";
		classMates[3]="Oleg";
		classMates[4]="Adem";
		
		System.out.println("My classmate name is "+classMates[3]);
		
		
		
		
		
	}

}
