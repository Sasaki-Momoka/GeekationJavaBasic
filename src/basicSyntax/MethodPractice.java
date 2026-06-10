package basicSyntax;

public class MethodPractice {
	// mainメソッドでint型の値aとbを定義&任意の値を代入して、メソッド1〜4の計算をする。メソッド５でその結果を出力する。
	// mainメソッドでint型の値aとbを定義&任意の値を代入して、
	public static void main(String[] args) {

		// 定義&任意の値を代入
		int num1 = 3;
		int num2 = 5;

		int addResult = add(num1, num2);
		int subResult = subtract(num1, num2);
		int multiResult = multiply(num1, num2);
		int divResult = divide(num1, num2);
		// メソッド呼び出し　

		result(addResult);
		result(subResult);
		result(multiResult);
		result(divResult);

	}

	// メソッド名add　引数int型a,b 足し算をしてmainに返す
	public static int add(int a, int b) {
		return a + b;
	}

	// メソッド名subtract　引数int型　引き算をしてmainに返す
	public static int subtract(int a, int b) {
		return a - b;
	}

	// メソッド名multiply　引数int型　掛け算をしてmainに返す
	public static int multiply(int a, int b) {
		return a * b;
	}

	// メソッド名divide　引数int型　割り算をしてmainに返す
	public static int divide(int a, int b) {
		return a / b;
	}

	// メソッド名result 引数int 計算結果に文字を組み合わせて出力する
	public static void result(int value) {
		System.out.println("計算結果は" + value + "です。");

	}

}
	

	

