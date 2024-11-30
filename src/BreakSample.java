
public class BreakSample {

	public static void main(String[] args) {
		// 検索対象のデータを準備
		int[] targetArray = {37, 85, 64, 57, 98, 100, 47, 23, 71, 69};

		//検索値を指定
		int search = 100;

		//カウンタ変数を宣言
		int i;

		//配列の全要素を対象に探す
		for(i = 0; i < targetArray.length; i++) {
			if(search == targetArray[i]) {
				break;
			}
		}

		//検索結果の判定
		if(i >= targetArray.length) {
			System.out.println("対象のデータが見つかりませんでした！");

		}else {
			System.out.println("添え字" + i + "に対象のデータが見つかりました！");
		}

		//変数の宣言
		int count = 0;

		//配列の全要素を対象に探す
		for(int value : targetArray) {
			if(value < 60) {
				continue;
			}

			//変数のカウントアップ
			count++;
		}

		//60以上の人数を表示
		System.out.println("60点以上の人は、" + count + "人です。");

	}

}
