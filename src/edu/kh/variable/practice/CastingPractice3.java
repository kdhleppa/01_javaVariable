package edu.kh.variable.practice;

import java.util.Scanner;

public class CastingPractice3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.print("국어 : ");
		double dNumInput1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		double dNumInput2 = sc.nextDouble();
		
		System.out.print("수학 : ");
		double dNumInput3 = sc.nextDouble();
		

		int dNumSum = (int)(dNumInput1 + dNumInput2 + dNumInput3);
		
		System.out.println();
		
		System.out.printf("총점 : %d\n", dNumSum);
		System.out.printf("평균 : %d\n", dNumSum / 3);				
	}

}
