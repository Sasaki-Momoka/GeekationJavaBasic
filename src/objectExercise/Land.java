package objectExercise;

public class Land extends Property {
	public double size;
//	double s;
	//広さの値


	//sizeのprintln
	public void detailLand() {
		System.out.println("広さ：" + this.size + "㎡");
		System.out.println("=============================");
	}

	//Landの共通項の引数　
	Land(String name, String human, String kinds, int price,double size) {
		super(name, human, kinds, price);
		this.size = size;
	}

}

	

