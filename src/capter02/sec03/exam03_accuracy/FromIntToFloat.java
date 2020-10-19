package capter02.sec03.exam03_accuracy;
public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456;
		int num2 = 123456;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}

