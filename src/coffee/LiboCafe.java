package coffee;

public class LiboCafe {

	public static void main(String[] args) {
		Guest guest = new Guest();
		Barista barista = new Barista();
		//손님이 메뉴를 본다
		guest.printMenu();
		barista.makeCoffee();		
		//메뉴에서 커피를 고른다
		//바리스타한테 커피를 주문한다
		//주문 받은 커피를 바리스타가 커피머신에서 만든다
		//완성된 커피를 손님한테.
	}

}
