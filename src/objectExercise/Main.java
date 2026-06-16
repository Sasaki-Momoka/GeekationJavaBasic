package objectExercise;

public class Main {
	public static void main(String[] args) {
		//　インスタンスフィールドに値を設定
		Apartment apartment = new Apartment("いい感じアパートメント", "山田　マンション太郎", "マンション", 50000000);
		//		Apartment apa = new apa(3);

		apartment.detail();
		apartment.detailApa();

		//Apartment apa2 = new Apartment(3);
		//apartment.detail();
		//floorのみの項目を呼び出そうとした。
		//apartment.floor();

		Land land = new Land("いい感じの土地", "山田　土地太郎", "土地", 8000000);
		land.detail();
		land.detailLand();
		//Landのみの項目を呼び出そうとした。
		//land.size();

	}

}
