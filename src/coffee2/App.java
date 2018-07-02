package coffee2;

public class App {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Barista barista = new Barista();
		Menu menu = new Menu();
		String menuName = menu.choose("아아");
		customer.order(menuName, menu, barista);

	}

}
