package coffee2;

public class Menu {
	String name;
	MenuItem menuItem;
	
	public Menu() {
		menuItem = new MenuItem(name, price);
	}
	
	public String choose() {
		return name;
	}
}
