
public class ArithmeticOperations {

	public static void main(String[] args) {
		// 変数の宣言・初期化
		int num1 = 100; //int型変数num1を宣言し、１００を代入
		int num2 = 10; //int型変数num2を宣言し、10を代入

		//int型変数result1を宣言し、num1とnum2の加算結果を代入
		int result1 = num1 + num2;
		//加算結果を出力
		System.out.println("num1 + num2 = " + result1);

		//int型変数result2を宣言し、num1とnum2の減算結果を代入
		int result2 =  num1 - num2;
		//減算結果を出力
		System.out.println("num1 - num2 = " + result2);

		//int型変数result3を宣言し、num1とnum2の乗算結果を代入
		int result3 = num1 * num2;
		//乗算結果を出力
		System.out.println("num1 * num2 = " + result3);

		//int型変数result4を宣言し、num1とnum2の除算結果を代入
		int result4 =  num1 / num2;
		//除算結果を出力
		System.out.println("num1 / num2 = " + result4);

		//int型変数result5を宣言し、num1とnum2の剰余算結果を代入
		int result5 = num1 % num2;
		//剰余算結果を出力
		System.out.println("num1 % num2 = " + result5);

		int [] result = new int[5];
		result[0] = num1 + num2;
		result[1] = num1 - num2;
		result[2] = num1 * num2;
		result[3] = num1 / num2;
		result[4] = num1 % num2;

		//加算結果を出力
		System.out.println("num1 + num2 = " + result[0]);
		//減算結果を出力
		System.out.println("num1 - num2 = " + result[1]);
		//乗算結果を出力
		System.out.println("num1 * num2 = " + result[2]);
		//除算結果を出力
		System.out.println("num1 / num2 = " + result[3]);
		//剰余算結果を出力
		System.out.println("num1 % num2 = " + result[4]);



	}

}
