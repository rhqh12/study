package omokgame;

public class Board {
	int width;
	int height;
	int cnt;
	Omok[] omoks;
	char[][] buf;
	
	int index = 0;
	
	public Board() {
		this(15,10);
	}
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		buf = new char[height][width];		
		omoks = new Omok[height*width];
		init();
	}
	
	public void init() {
		for (int y = 0; y < height; y++)
			for (int x = 0; x <width; x++)
				buf[y][x] = '┼';		
	}
	
	public void put(Omok omok) {
		omoks[index++] = omok;
		redraw();
	}
		
	void redraw() {
		init();
		for(Omok omok : omoks) {
			if(omok != null)
				omok.draw(buf);
		}
	}
	/*for (int y=0; y<height; y++) {
		for (int x=0; x<width; x++) 
			System.out.printf("%c", buf[y][x]);
		System.out.println();			
	}*/
	
	//약속을 정하고, 구현하고 있는 객체를 넘겨 받아 이용하기
	private Printable printable;	
		
	public void setPrintable(Printable printable) {
		this.printable = printable;
	}
	public void print() {
		if(printable != null)
			printable.print(buf);
	}
}