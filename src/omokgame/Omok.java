package omokgame;

import java.util.HashMap;
import java.util.Map;

public class Omok {
	Map<String, Integer> omok;	
	
	public Omok(int x, int y) {		
		omok = new HashMap<String, Integer>();
		omok.put("Y좌표", y);
		omok.put("X좌표", x);
	}
}
