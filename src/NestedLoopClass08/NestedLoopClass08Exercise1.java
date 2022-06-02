package NestedLoopClass08;

public class NestedLoopClass08Exercise1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {//outerLoop
			
			System.out.println("Hello");
			
			for(int y=1; y<=2; y++) {//nestedLoop
				
				System.out.println("Bye");
			}
		}
		System.out.println("------------------------------------");
            for(int i=1; i<=3; i++) {//outerLoopcontrol inner loop
			
			System.out.println("Hello");
			
			for(int y=1; y<=2; y++) {//nestedLoop depends on the outer loop
				
				System.out.println(y);
	}
			System.out.println("------------------------------------");
			
			 for(int i=1; i<=3; i++) { //outerLoopcontrol inner loop
					
					
					
					for(int y=1; y<=2; y++) {//nestedLoop depends on the outer loop
						
					
						
						System.out.println(y);
}
					
					System.out.println("------------------------------------");
					
					
