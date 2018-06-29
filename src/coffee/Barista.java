package coffee;

import java.util.Scanner;

public class Barista {
	Scanner scan;
	Machine machine;
	Menu menu;
	String coffee;
	
	public Barista() {
		scan = new Scanner(System.in);
		menu = new Menu();
	}
	
	public void makeCoffee() {

	}


	public void order() {
		System.out.println("어떤 커피를 주문하시겠습니까?");
		coffee = scan.next();		
	}
	

}
