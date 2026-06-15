package objectExercise;

public class Land extends Property {

	double size = 105.2;

	public void size(int b) {
		System.out.println("広さ" + b + "㎡");
	}

	Land(String name, String human, String kinds, int price) {
		super(name, human, kinds, price);

	}

}

	

	

