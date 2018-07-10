package omokgame;

public class WhiteOmok extends Omok{	
	public WhiteOmok(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(char[][] buf) {
		buf[y][x] = '○';	
	}
}
