package coffee;

import java.util.Scanner;

public class Barista{
	Scanner scan;
	Machine machine;
	Menu menu;
	String coffee;
	
	public Barista() {
		scan = new Scanner(System.in);
		menu = new Menu();
	}
	
	public String makeCoffee() {
		System.out.println(coffee+" 나왔습니다.");
		return coffee;
	}
	
	public int gusetPaymenut() {
		return scan.nextInt();
	}


	public String order() {
		System.out.println("어떤 커피를 주문하시겠습니까?");
		boolean order = false;
		while(order == false) {
			coffee = scan.next();
			menu.menu.get(coffee);
			if(menu.menu.containsKey(coffee)) {
				int coffeeAmount = menu.menu.get(coffee);
				int guestAmount = 0;
				System.out.println("커피 금액은 "+ String.format("%,d", coffeeAmount) + "원입니다.");
				System.out.print(">>>");
				do {
					if(guestAmount>0)
						System.out.println(String.format("%,d", coffeeAmount-guestAmount) +"원 더 주세요.");
					guestAmount += gusetPaymenut();
				} while (coffeeAmount > guestAmount);
				if(guestAmount>coffeeAmount)
					System.out.println(String.format("%,d", guestAmount-coffeeAmount)+"원 거스름돈 받아주세요.");
				order = true;
			}
			else
				System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
		}
		return makeCoffee();
	}
	

}
