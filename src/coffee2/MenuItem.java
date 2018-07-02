package coffee2;

public class MenuItem {
	String name;
	int price;
	
	
	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int cose() {
		return price;
	}

	public String getName() {
		return name;
	}
}
