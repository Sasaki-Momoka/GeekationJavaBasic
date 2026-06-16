package objectExercise;

//Apartment
public class Apartment extends Property {
	public int floor;
//	this.floor = floor;
//	int floor = 3;

	public void detailApa() {
		System.out.println("間取り：" + this.floor + "LDK");
		System.out.println("=============================");
	}

	//Apartmentの共通項の引数
	Apartment(String name, String human, String kinds, int price,int floor) {

		super(name, human, kinds, price);
		this.floor = floor;

	}
	
	}




