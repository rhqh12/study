package omokgame;

public abstract class Omok {
	int x;
	int y;
	char type;
	
	public Omok() {
		
	}
	
	public Omok(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getY() {
		return x;
	}

	public int getX() {
		return y;
	}

	public char getType() {
		return type;
	}

	//공통분모 추상 메소드 [abstract]이거 쓰면 상속받은 자식이 무조건 이 메소드를 정의해야함 구현 안하면 자식이 에러남 //왜를 설명해보자앙
	public abstract void draw(char[][] buf);
}
