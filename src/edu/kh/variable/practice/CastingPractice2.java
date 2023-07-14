package edu.kh.variable.practice;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("문자 :      ");
		
		// String input = sc.next(); //A
		// char result = input.charAt(0);
		
		char cInput1 = sc.next().charAt(0);
		System.out.println();
		int iUni1 = (int) cInput1;
		System.out.printf("%s unicode : %d", cInput1, iUni1);
		
		

	}

}
