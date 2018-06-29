package coffee;

import java.util.Scanner;

public class Guest {
	Menu menu;
	Barista barista;
	Scanner scan;
	String coffee;
	
	public Guest() {
		menu = new Menu();
		barista = new Barista();
		Scanner scan = new Scanner(System.in);
	}

	public void printMenu() {
		menu.print();
	}

	public void orderBarista() {
		barista.order();
	}
}
