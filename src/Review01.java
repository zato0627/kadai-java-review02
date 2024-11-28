
public class Review01 {

	public static void main(String[] args) {

		//cash=元の金額,tax=消費税,taxin=税込み価格
		int cash = 1985;
		double tax = tax(1985, 0.1);
		int taxin = cash + (int)tax;


		System.out.println(cash + "円の商品の税込み価格は" + taxin + "円（消費税は" + (int)tax + "円）です");

	}
	public static  double tax(double cash, double tax) {
		//消費税を計算してmainに戻す

		//消費税を計算
		double taxin = cash * tax;

		return taxin;
	}

}
