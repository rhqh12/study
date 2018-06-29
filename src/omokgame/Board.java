package omokgame;

public class Board {
	int width;
	int height;
	int cnt;
	char[][] buf = new char[height][width];
	
	public Board() {
		this(15,10);
	}
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		buf = new char[height][width];
		
		for (int y = 0; y < height; y++)
			for (int x = 0; x <width; x++)
				buf[y][x] = '╉';
		
	}
	void put(Omok omok) {
		
		int y = omok.omok.get("Y좌표");
		int x = omok.omok.get("X좌표");
		
		if(buf[y][x] == '╉') {
			if(cnt % 2 == 0)
				this.buf[y][x] = '●';
			else
				this.buf[y][x] = 'O';
			cnt++;
		} else {
			System.out.println("이미 바둑알이 있습니다.");
		}
	}
	public void print() {
		for (int y=0; y<height; y++) {
			for (int x=0; x<width; x++) 
				System.out.printf("%c", buf[y][x]);
			System.out.println();			
		}	
	}
}