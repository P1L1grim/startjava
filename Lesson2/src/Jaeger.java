public class Jaeger {
	private String modelName;
	private int height;
	private int weight;
	private int caliber;

	public Jaeger(String a, int b, int c, int d){
		modelName = a;
		height = b;
		weight = c;
		caliber = d;
	}

	public String getModelName(){
		return modelName;
	}
	public void setModelName(String modelName){
		this.modelName = modelName;
	}
	public int getHeight(){
		return height;
	}
	public void setHeight(int height){
		if (height < 20){System.out.println("Слишком маленький рост");}
			else if (height > 60) {System.out.println("Слишком большой рост");}
			else {this.height = height;}
	}
	public int getWeight(){
		return weight;
	}
	public void setWeight(int weight){
		if (weight < 200){System.out.println("Слишком маленький вес");}
			else if (weight > 500) {System.out.println("Слишком большой вес");}
			else {this.weight = weight;}
	}
	public int getCaliber(){
		return caliber;
	}
	public void setCaliber(int caliber){
		if (caliber < 30){System.out.println("Слишком маленький калибр");}
			else if (caliber > 100) {System.out.println("Слишком большой калибр");}
			else {this.caliber = caliber;}
	}

	public void run () {
		if (weight > 400) {System.out.println("Скидыщ-скидыщ-скидыщ");}
		else {System.out.println("Топ-топ-топ-топ");}	
	}

	public void shoot() {
		if (caliber > 50) {System.out.println("ПЫЩ-ПЫЩ-ПЫЩ-ПЫЩ!");}
		else {System.out.println("Пиу-пиу-пиу-пиу!");}

	}
}