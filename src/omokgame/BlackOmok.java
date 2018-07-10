package omokgame;

public class BlackOmok extends Omok{	
	
	public BlackOmok(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void draw(char[][] buf) {
		buf[y][x] = '●';
	}
}
