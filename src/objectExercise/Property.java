package objectExercise;

public class Property {
	
	private String name;
	private String human;
	private String kinds;
	private  int price;
	private  int floor;
	private double size;
	
	
Property(String name, String human, String kinds, int price, int floor,double size){
		
		this.name = name;
		this.human =human;
		this.kinds = kinds;
		this.price = price;
		this.floor = floor;
		this.size = size;	
	}
	
	
	
	public void detail() {
		System.out.println("物件名：" + this.name);
		System.out.println("物件所有者名：" + this.human);
		System.out.println("物件種別：" + this.kinds);
		System.out.println("物件価格：" + this.price + "円");
		System.out.println("間取り：" + this.floor + "LDK");
		System.out.println("広さ：" + this.size + "㎡");
	}
		
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
		  
		  public int getFloor() {
			    return this.floor;
			    }
		  
		  public double getSize() {
			    return this.size;
			    }
		 
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
		  
		  public int setFloor() {
			    return this.floor;
			    }
		  
		  public double setSize() {
			    return this.size;
			    }
		 
		
			
	}

