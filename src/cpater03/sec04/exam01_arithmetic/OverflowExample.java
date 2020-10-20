package cpater03.sec04.exam01_arithmetic;
public class OverflowExample {
	public static void main(String[] args) {
		
		int x1 = 1000000;
		int y1 = 1000000;
		int z1 = x1 * y1;
		System.out.println(z1);
		
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}
}

