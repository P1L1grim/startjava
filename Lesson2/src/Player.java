public class Player {
	private String name;
	private int number;

	public Player(String a, int b) {
		name = a;
		number = b;
	}
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}
}