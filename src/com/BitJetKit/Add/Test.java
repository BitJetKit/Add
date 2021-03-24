package com.BitJetKit.Add;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double userNumber;
		Add adder = new Add();
		Scanner reader = new Scanner(System.in);
		
		System.out.println("===============Add===============");
		System.out.println("Enter 2 numbers from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ".");
		
		System.out.println("\nEnter the 1st number: ");
		userNumber = reader.nextDouble();
		adder.setNumber1(userNumber);
		
		System.out.println("\nEnter the 2nd number: ");
		userNumber = reader.nextDouble();
		adder.setNumber2(userNumber);
		adder.setSum(adder.getNumber1(), adder.getNumber2());
		adder.printSum();
	}
}
