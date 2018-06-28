package lotto;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LottoProgram{
	
	public static void main(String[] args) {
		final int AUTO_ADD = 1;
		final int MANUAL_ADD = 2;
		final int PRINT = 3;
		final int EXIT = 4;
		int menu;
		
		Lotto lotto = new Lotto();
		
		//객체 초기화 해주기 [객체의 초기화에서 캡슐을 깨는 문제가 발생] 
		lotto.num = 6;
		lotto.list = new ArrayList<Set>();
		lotto.tempStorage = new ArrayList<Set>();
		
		Menu:while(true) {
			menu = lotto.inputMainMenu();		
			switch (menu) {
			case AUTO_ADD:			
				lotto.genAuto();
				break;
			case MANUAL_ADD:
				lotto.genManual();
				break;
			case PRINT:
				lotto.print(lotto.list);
				break;
			case EXIT:
				break Menu;
			default:
				break;
			}			
		}
	}	
}