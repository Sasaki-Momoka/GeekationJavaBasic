package objectExercise;

public class Main {
	public static void main(String[] args) {
		//　インスタンスフィールドに値を設定
		Apartment apartment = new Apartment("いい感じアパートメント", "山田　マンション太郎", "マンション", 50000000);
		apartment.detail();
		//floorのみの項目を呼び出そうとした。
			apartment.floor();

		Land land = new Land("いい感じの土地", "山田　土地太郎", "土地", 8000000);
		land.detail();
		//Landのみの項目を呼び出そうとした。
		land.size();

	}

}
