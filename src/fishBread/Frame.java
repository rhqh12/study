package fishBread;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Frame {
	static final int CNT = 6;
	int[] frame;
	List<String> material;
	
	public Frame() {		
		frame = new int[CNT];
		material = new ArrayList<String>();		
		material.add("팥");
		material.add("반죽");
	}
}
