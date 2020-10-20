package capter02.sec01.exam01_variable;

public class VariableScopeExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int var1; // 메인 안 전체에서 사용가능 
		
		if(true) {
			
			int var2; // if문 안에서만 사용 가능 
			
			var1 = 10;
			var2 = 20;
		}
		
		var1 = 10;
		//var2 = 20; //사용불가 
		
		for(int i=0; i<1; i++) {
			int var3;  // for 문 안에서만 사용 가능 
			
			var1 = 10;
			var3 = 30;
			var1 += var3;
		}
		
		var1 = 10;
		//var2= 10;
		//var3 = 30; //사용불가 
		
		
	}
}
