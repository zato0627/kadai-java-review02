
public class Review01 {

	public static void main(String[] args) {

		//cash=元の金額,tax=消費税,taxin=税込み価格
		int cash = 3000;
		int tax = tax(cash, 100, 10);//tax(数字, 100, 10)からtax(cash, 100, 10)に変更
		int taxin = cash + tax;


		System.out.println(cash + "円の商品の税込み価格は" + taxin + "円（消費税は" + tax + "円）です");

	}
	public static  int tax(double cash, double num1, double num2) {
		//消費税を計算してmainに戻す

		//消費税を計算
		double taxs = cash * (num2 / num1);

		//intに変換
		int tax = (int)taxs;

		return tax;
	}

}
