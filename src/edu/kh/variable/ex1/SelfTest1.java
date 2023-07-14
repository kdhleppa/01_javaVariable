package edu.kh.variable.ex1;

public class SelfTest1 {
	public static void main(String[] args) {
		
		int iNum1 = 10;
		double dNum1 = 0.1;
		double dNum2 = 1.1;
		double dNum3 = 1.234;

		
		// 자동형변환이 되는경우
		System.out.println("자동형변환의경우 : " + iNum1 * dNum3);
		
		// 실수를 형변환 하는경우
		int iNum2 = (int) dNum1;
		int iNum3 = (int) dNum2;
		System.out.println(iNum2); // 실수의 소수점값이 제거되어 0.1 -> 0
		System.out.println(iNum3); // 1.1 -> 1
		
		System.out.println(iNum1 * dNum1);
		
		// double num4 = num1 * num3;
		//System.out.printf("%.0f", num4);
		
		//int iNum3 = num3;
		
		//System.out.println(iNum3);
	}

}
