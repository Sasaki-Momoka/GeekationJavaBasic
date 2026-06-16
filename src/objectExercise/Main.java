package objectExercise;

public class Main {
	public static void main(String[] args) {
		//　インスタンスフィールドに値を設定
		Apartment apartment = new Apartment("いい感じアパートメント", "山田　マンション太郎", "マンション", 50000000);

		//detail,detailApaの呼び出し
		apartment.detail();
		apartment.detailApa();

		//detail,detailLandの呼び出し
		Land land = new Land("いい感じの土地", "山田　土地太郎", "土地", 8000000);
		land.detail();
		land.detailLand();

	}

}
