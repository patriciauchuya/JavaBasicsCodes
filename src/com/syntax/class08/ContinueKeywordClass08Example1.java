package com.syntax.class08;

public class ContinueKeywordClass08Example1 {

	public static void main(String[] args) {
		
//continue - skips everything that is below or under current execution/iteration ,can be use in any loop
	//when java executes continue->
		//go back to the beginning of the loop,
		//so rest of the code inside loop body
		//will be skipped/ignored
		for(int 1=1; i<=5; i++) {
			
			if (i==2) {
				continue;
			}
			System.out.println(i + " ");
		}
		//print numbers from 1 to 10 except number 5 and 7
		
		for (int i=1; i<=10; i++) {
			if (i==5  ||  i==7) {
			continue;	
			}
			
				
				System.out.println(i+ " ");
			}
		}
	}

}
