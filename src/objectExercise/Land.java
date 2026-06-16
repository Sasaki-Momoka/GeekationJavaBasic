package objectExercise;

public class Land extends Property {
	public double size;

	//Landの共通項の引数　
	Land(String name, String human, String kinds, int price, double size) {
		super(name, human, kinds, price);
		this.size = size;
	}

	//sizeのprintln
	public void detailLand() {
		System.out.println("広さ：" + this.size + "㎡");
		System.out.println("=============================");
	}

}
	

