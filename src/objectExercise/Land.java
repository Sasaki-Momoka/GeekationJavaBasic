package objectExercise;

public class Land extends Property {
	
	
	public void detailLand() {
		System.out.println("広さ：" + this.size + "㎡");
		System.out.println("=============================");
	}
	
	Land(String name, String human, String kinds, int price) {
		super(name, human, kinds, price);
}
double size = 105.2;
//	Land(double size){
//		super(size);
//	}
	
//	private double detailLand;

//	public void detailLand(double m) {
//		m = 3;
//		}
	
//	double size = 105.2;

//	public void size(double b) {
//		System.out.println("広さ" + b + "㎡");
}

	

	

