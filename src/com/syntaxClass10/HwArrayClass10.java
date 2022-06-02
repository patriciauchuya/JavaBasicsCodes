package com.syntaxClass10;

public class HwArrayClass10 {

	public static void main(String[] args) {
		
		double[] num = { 2.99, 3.99, 4.99,5 };
		
		for (double x : num) {
			System.out.println(x + " ");
		}

		System.out.println();
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
		
		//Another Hw
		//create an 
		
		int[] numbers= {1,222,3,4,5};
		
		int sum=0;
		
		sum=sum+numbers[i];
		
		System.out.println("sum of all elements = "+sum);
		
		sum=0;
		
		for(int n:numbers) {
			
			sum+=n;
		}
		
		System.out.println("Sum of all elements ="+sum);
		}
	}

}
