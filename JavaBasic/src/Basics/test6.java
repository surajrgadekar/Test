package Basics;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input First number");	
		int num1=in.nextInt();
		System.out.print("Enter second number");
		int num2=in.nextInt();
		System.out.println(num1 + "x" + num2 + "="+num1*num2);
	}
	

}
