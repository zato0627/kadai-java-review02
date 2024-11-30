
public class IfSample1 {

	public static void main(String[] args) {
		int score = 59; //成績


		String result = (score >= 60) ? "合格です" : "赤点です...";

		//scoreが60以上ならば
		if(score >= 60) {
			//合格です！と表示
	    	System.out.println("合格です！");

		}else {
			//赤点です...と表示
			System.out.println("赤点です...");

		}


	}

}
