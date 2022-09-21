package sec2;

public class Student1 {
	String name;
	int kor;
	int eng;
	int mat;
	
	public Student1 () {}
	public Student1 (String name){this.name=name;}
	public Student1(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public int calcTot(){
		return kor+eng+mat;
	}
	public double calcAvg(){
		return (float)(kor+eng+mat/3);
	}
	public String calcHak(){
		String hak="";
		double avg=this.calcAvg();
		if (avg>=90){
			hak="A";
		}else if (avg>=80){
			hak="B";
		}else if (avg>=70){
			hak="C";
		}else {
			hak="D";
		}
		return hak;
	}
	public String calcRes(){
		String res="";
		double avg=this.calcAvg();
		res="불합격";
		if(avg>=80){
			res="합격";
		}
		return res;
	}
	
}
