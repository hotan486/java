package cpater03.sec04.exam01_arithmetic;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}
	
	public static int safeAdd(int left, int right)  {
		System.out.println("left:" +left);
		System.out.println("right:" +right);
		System.out.println("left:" +Integer.MAX_VALUE);
		System.out.println("left:" +Integer.MIN_VALUE);
		
		System.out.println("left:" +(Integer.MAX_VALUE - right));
		System.out.println("left:" +(Integer.MIN_VALUE-right));
		
		//6 + 6
		//max 10 
		//10 - 6 = 4
		// 6 6
		//-10 -6  10 9 8 7 6 5 > 6
		if((right>0)) { 
			if(left>(Integer.MAX_VALUE - right)) {  //맥스값에서 right를 뺴면 right에 더할수있는최대치가 나오는데 그 값보다 크면 오류
				
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left<(Integer.MIN_VALUE - right)) { // 
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}
}
