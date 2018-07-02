package exam;

public class App {

	public static void main(String[] args) {
		NewlectExam exam = new NewlectExam(1,1,1,1);
		//참조할 곳에 함수가 없으면 에러 
		Exam exam2 = new NewlectExam(1,1,1,1);		
		System.out.println(exam.total()); //4
		System.out.println(exam2.total()); //3이 나와야하는데 4가 나옴! [c++은  옵션에 따라 3 또는 4로 나옴]  
		//그 이유는 자바는 참조형식의 함수보다 객체 형식의 함수 호출을 우선으로 하기 때문!
		System.out.println(exam.avg());
	}
}
