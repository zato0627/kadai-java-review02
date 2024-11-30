
public class Review02 {

	public static void main(String[] args) {
		// iの値が1から100までの間、処理を繰り返す
		for(int i =1; i <= 100; i++) {

			if(i % 3 == 0 && i % 5 == 0) {
				//3と5で割り切れるとき
				System.out.println("FizzBuzz");

			}else if(i % 3 == 0) {
				//3で割り切れるとき
				System.out.println("Fizz");

			}else if(i % 5 == 0) {
				//5で割り切れるとき
				System.out.println("Buzz");
			}else {

				System.out.println(i);

			}
		}



		//1から100までの連続した整数を画面に表示する。ただし、下記の条件にしたがうこと：
		//もし、その整数が3で割り切れる数なら "Fizz" と表示する
		//・もし、その整数が5で割り切れる数なら "Buzz" と表示する
		//・上記2つの条件は同時に満たせる。つまり、もし、その整数が3で割り切れ、なおかつ5で割り切れる数なら "FizzBuzz" と表示する
		//・それ以外の数は、その数をそのまま表示する

	}

}
