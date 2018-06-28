package lotto;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
	int num;	
	List<Set> list;
	List<Set> tempStorage;	
	
	//값을 넣을 수 없다 
	//틀 작업만 해주고 
	//생성자쪽에서 초기 값을 넣어줘야함
	
	//static => 무조건 함수, 매개변수를 받겠다. [정적]
	//static이 없으면 인스턴스 함수, 객체 함수 [객체를 받겠다]
	void genAuto() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("생성할 개 수 : ");
		int row = scan.nextInt();
		
		this.tempStorage.clear();
		
		for (int i = 0; i < row; i++) {
			Set<Integer> nums = new LinkedHashSet<>();
			while( nums.size() < this.num){
				Double d = Math.random() * 45 + 1;
				nums.add(d.intValue()); 
			}
			this.tempStorage.add(nums);			
		}
		
		System.out.println("1. Lotto 번호 자동 생성");
		print(this.tempStorage);
		save();
	}
	
	void genManual() {
		Scanner scan = new Scanner(System.in);
		this.tempStorage.clear();
		
		System.out.println("2. Lotto 번호 수동 생성");
		System.out.println("번호를 입력하세요(예 6 7 12 20 40 45)");
		System.out.println("단. 그만 입력하려면 -1을 입력하세요)");
		
		gen:while (true) {
			System.out.print(" > ");
			
			Set<Integer> nums = new LinkedHashSet<>();
			for (int i = 0; i < this.num; i++) {
				int num = scan.nextInt();
				if(num == -1) {
					break gen;
				}else{
					nums.add(num);
				}
			}
			this.tempStorage.add(nums);      
		}
		print(this.tempStorage);
		save();		
	}
	
	private void save(){
		
		final int SAVE = 1;
		final int EXIT = 2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 저장하기");
		System.out.println("2. 상위메뉴로 가기");
		System.out.print(" > ");
		int menu = scan.nextInt();
		switch (menu) {
		case SAVE:
			this.list.addAll(this.tempStorage);			
			break;
		case EXIT:
			break;
		default:
			break;
		}
	}
	
	void print(List<Set> list) {
		System.out.println("인덱스  로또번호");
		int index = 1;
		if( list.size() == 0 ) {
			System.out.println("로또 번호가 없습니다.");
		} else {
			for (Set set : list) {
				System.out.printf("%d | %s\n", index, set);
				index++;
			}			
		}	
	}
	
	int inputMainMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lotto 관리 프로그램");
		System.out.println("1. 번호 자동 생성");
		System.out.println("2. 번호 수동 생성");
		System.out.println("3. 내 로또 번호 보기");
		System.out.println("4. 종료");
		System.out.print(" > ");
		
		return scan.nextInt();
	}
}
