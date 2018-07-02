package exam;
public class NewlectExam extends Exam{
	private int com;
	
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return super.total()+com;
	}
	
	@Override
	public float avg() {
		return total()/4.0f;
	}
	
	public NewlectExam() {
		super();
	}
	
	public NewlectExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}
}
