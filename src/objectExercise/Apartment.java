package objectExercise;

//Apartment
public class Apartment extends Property {

	int floor = 3;

	public void detailApa() {
		System.out.println("間取り：" + this.floor + "LDK");
		System.out.println("=============================");
	}

	//	Apartment(int floor){
	//		super(floor);
	//	}

	//Apartmentの共通項の引数
	Apartment(String name, String human, String kinds, int price) {
		//親クラスで使える様にする
		super(name, human, kinds, price);

		//detailApa();
		//	//floorの出力
		//	int a = 3;
		//	
		//	public void floor(int a) {
		//		System.out.println("間取り" + a + "LDK");
	}

}
	



