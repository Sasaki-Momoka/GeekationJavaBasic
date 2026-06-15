package objectExercise;

public class Property {
	//　フィールドはプライベート
	private String name;
	private String human;
	private String kinds;
	private int price;

	//　共通項　コンストラクタの引数にインスタンスフィールドを渡す
	Property(String name, String human, String kinds, int price) {

		this.name = name;
		this.human = human;
		this.kinds = kinds;
		this.price = price;

	}

	//　共通項の出力
	public void detail() {
		System.out.println("物件名：" + this.name);
		System.out.println("物件所有者名：" + this.human);
		System.out.println("物件種別：" + this.kinds);
		System.out.println("物件価格：" + this.price + "円");
		//System.out.println("間取り：" + this.floor + "LDK");
	}

	//	public void detailApa() {
	//		System.out.println("間取り：" + this.floor + "LDK");
	//	}

	//	public void detail() {
	//		System.out.println("物件名：" + this.name);
	//		System.out.println("物件所有者名：" + this.human);
	//		System.out.println("物件種別：" + this.kinds);
	//		System.out.println("物件価格：" + this.price + "円");
	//		//System.out.println("広さ：" + this.size + "㎡");
	//	}

	//	public void detailLand() {
	//		System.out.println("広さ：" + this.size + "㎡");
	//	}

	//　ゲッター、セッター
	public String getName() {
		return this.name;
	}

	public String getHuman() {
		return this.human;
	}

	public String getKinds() {
		return this.kinds;
	}

	public int getprice() {
		return this.price;
	}

	//		  public int getFloor() {
	//			    return this.floor;
	//			    }

	public String setName() {
		return this.name;
	}

	public String setHuman() {
		return this.human;
	}

	public String setKinds() {
		return this.kinds;
	}

	public int setprice() {
		return this.price;
	}

}

