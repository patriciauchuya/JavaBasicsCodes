package com.syntaxClass10;

public class RecapArrayClass10 {

	public static void main(String[] args) {
		
		String[] disney= {"Shrek" , "Elsa" , "Goofy" , "Mulan" , "Tom&Jerry"};
		
		System.out.println(disney[1]); //Elsa
		
		System.out.println("All elements using regular for loop-----------");
		
		//to get all elements from an array
		
		for(int i=0; i<disney.length; i++ ) {
			
			if(disney[i].equalsIgnoreCase("Shrrek")) {
		}
			
			System.out.println(disney[i]+" ");
		}
		System.out.println("All elements using regular for loop-----------");
		
		for(String character:disney) {
			
			if(character.equalsIgnoreCase("Mulan")){
                System.out.println(character + " is my favorite character");
		}else {
			System.out.print(character+" ");
		}
	}

}
