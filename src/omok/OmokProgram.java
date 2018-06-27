package omok;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OmokProgram {
	static int count = 0;	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] 돌쇠판 = 오목판샌성();
		while(true) {		
			오목판출력(돌쇠판);				
			Map<String, Integer> 오목 = 오목입력();
			오목판에오목두기(돌쇠판, 오목);
			오목판출력(돌쇠판);			
		}
	}
	private static Map<String, Integer> 오목입력() {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> input = new HashMap();
		
		System.out.println("x sp y >> ");		
		int y = scan.nextInt()-1;
		int x = scan.nextInt()-1;
		
		input.put("Y좌표", y);
		input.put("X좌표", x);
		
		return input;
	}

	private static char[][] 오목판샌성() {
		char[][] board = new char[10][15];
		for (int y = 0; y < 10; y++)
			for (int x = 0; x <15; x++)
				board[y][x] = '╉';
		return board;
	}	
	
	private static void 오목판출력(char[][] board) {
		for (int y=0; y<10; y++) {
			for (int x=0; x<15; x++) 
				System.out.printf("%c", board[y][x]);
			System.out.println();			
		}	
	}	
	
	private static void 오목판에오목두기(char[][] board, Map<String, Integer> 오목) {
		int y = 오목.get("Y좌표");
		int x = 오목.get("X좌표");
		
		if(board[y][x] == '╉') {
			if(count % 2 == 0)
				board[y][x] = '●';
			else
				board[y][x] = 'O';
			count++;
		} else {
			System.out.println("이미 바둑알이 있습니다.");
		}
		System.out.println();
				
	}
}
