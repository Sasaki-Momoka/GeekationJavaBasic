package basicSyntax;

public class ComparisonLogicalOperators {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//1
		int a = 33;
		int b = 11;
		boolean isGraterA =(a > b);
	
		//2
		boolean isSunny = true;
		boolean isWarm = true;
		boolean result =(isSunny && isWarm);
	
		//3
		int x = 35;
		int y =22;
		boolean number =  (x >= 0 && y % 2 == 0);
		
	
		//4
		boolean hasPermission = false;
		
	
		//1
		System.out.println(isGraterA);
	
		//2
		System.out.println(number);
		
		//3
		System.out.println(result);

		//4
		System.out.println(!hasPermission);
		
	}

}
