package objectExercise;

//Apartment
public class Apartment extends Property {

	//private int setFloor;
	//	
	//	public void setFloor(int s) {
	//		setFloor= 3;
	//	}

	//Apartmentの共通項の引数
	Apartment(String name, String human, String kinds, int price) {
//親クラスで使える様にする
		super(name, human, kinds, price);
	}

	//floorの出力
	public void floor(int a) {
		System.out.println("間取り" + a + "LDK");
	}

}



