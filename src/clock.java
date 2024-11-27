
public class clock {

	public static void main(String[] args) {
		//
		getSeconds(18, 32, 47);



	}

	public static void getSeconds(int num1, int num2, int num3) {
		//
		int result = (num1 * 60 * 60) + (num2 * 60) + num3;
		System.out.println("18時34分４７秒の経過秒数は" + result);

	}

}
