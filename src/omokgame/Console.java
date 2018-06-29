package omokgame;

import java.util.Scanner;

public class Console {
	Board board;
	Scanner scan;
	
	public Console() {
		board = new Board();
		scan = new Scanner(System.in);
	}
	
	void printBoard() {
		board.print();
	}
	public Omok inputOmok() {
		
		System.out.println("x sp y >>>> ");		
		int x = scan.nextInt()-1;
		int y = scan.nextInt()-1;		
		Omok omok = new Omok(x, y);
		return omok;
	}
	public void putOmokonBoard(Omok omok) {
		board.put(omok);	
	}	
}
