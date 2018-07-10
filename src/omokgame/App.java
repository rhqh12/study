package omokgame;

public class App {

	public static void main(String[] args) {
		
		Console console = new Console();
		while(true) {
			//1. 오목판을 출력하고
			console.printBoard();
			//2. 오목을 입력받아서
			Omok omok = console.inputOmok();
			//3. 오목판에 오목을 두고 
			console.putOmokonBoard(omok);
			//4.오목판을 출력한다
			//console.printBoard();			
		}
		
	}

}
