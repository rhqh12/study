package omokgame;

import java.util.Scanner;

public class Console {
	Board board;
	Scanner scan;
	Omok omok;
	int cnt;
	
	public Console() {
		board = new Board();
		scan = new Scanner(System.in);
		cnt = 0;
	}
	
	public void printBoard() {
		board.print();
	}
	public Omok inputOmok() {
		System.out.println("x sp y >>>> ");		
		int x = scan.nextInt()-1;
		int y = scan.nextInt()-1;

		if(cnt % 2 == 0) 
			omok = new BlackOmok(x, y);
		else
			omok = new WhiteOmok(x, y);
		cnt++;
		return omok;
	}
	public void putOmokonBoard(Omok omok) {
		board.put(omok);	
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}	
	
}
