
public class SevenNumber {

	public static void main(String[] args) {
		// iの値が1から100までの間、処理を繰り返す
		for(int i = 1; i <=100; i++) {
			//7の倍数と７が入っている数の時にはclalp!と表示させる

			//iが7で割り切れるときor iを10割ったら7が余るときor iを10で割ったら7の時
			if(i % 7 == 0 ||  i % 10 == 7 || i / 10 == 7) {
				System.out.println("i = clap!");
			}	else {
				System.out.println("i = "+i);
			}

		}
	}
}

