package coffee;

import java.util.Map;
import java.util.TreeMap;

public class Menu {
	Map<String, Integer> menu;
	
	public Menu() {
		menu = new TreeMap<>();
		menu.put("아메리카노", 2000);
		menu.put("카페라떼", 3000);
		menu.put("핸드드립", 4000);
	}

	public void print() {
		System.out.println("<<리보 카페 메뉴>>");
        for( String coffee : menu.keySet() )
            System.out.println( String.format("%s %d원", coffee, menu.get(coffee)) );
	}
	
}
