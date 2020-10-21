package cpater03.sec04.exam01_arithmetic;

public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf( userInput );
		System.out.println(val);
		double currentBalance = 10000.0;
		System.out.println(currentBalance);
		currentBalance += val;
		System.out.println(currentBalance);
	}
}

