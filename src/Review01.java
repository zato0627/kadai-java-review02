
public class Review01 {

	public static void main(String[] args) {

		//cash=元の金額,tax=税込み金額,base=消費税
		double cash = 1985;
		double tax = getTax(1985, 0.1);
		double base = tax - cash;

		//doubleからintに変換して表示
		System.out.println((int)cash + "円の商品の税込み価格は" + (int)tax + "円（消費税は" + (int)base + "円）です");

	}
	public static  double getTax(double cash, double tax) {
		//消費税額を計算してmainに戻す

		//消費税を計算
		double base = cash * tax;
		//税込み金額を計算して戻す
		double result = cash + base;
		return result;
	}

}
