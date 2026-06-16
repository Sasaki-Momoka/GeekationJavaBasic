package objectExercise;

public class Land extends Property {
	//広さの値
	double size = 105.2;

	//sizeのprintln
	public void detailLand() {
		System.out.println("広さ：" + this.size + "㎡");
		System.out.println("=============================");
	}

	//Landの共通項の引数　
	Land(String name, String human, String kinds, int price) {
		super(name, human, kinds, price);
	}

}

	

