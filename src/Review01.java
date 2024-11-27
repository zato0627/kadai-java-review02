
public class Review01 {

	public static void main(String[] args) {
		double cash = 1500;
		double tax = getTax(1500, 0.1);
		double base = tax - cash;
		System.out.println(cash + "円の商品の税込み価格は" + tax + "円（消費税は" + base + "円）です");

	}
	public static  double getTax(double cash, double tax) {
		//消費税額を計算してmainに戻す

		double base = cash * tax;
		double result = cash + base;
		return result;
	}

}
