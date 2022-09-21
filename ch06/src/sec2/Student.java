package sec2;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	
	public Student () {}
	public Student (String name){this.name=name;}
	public Student (String name,int kor,int eng,int mat){
		this.name=name; this.kor=kor; this.eng=eng; this.mat=mat;
	}
	
	public int calcTot(){
		return kor+eng+mat;
	}
	public double calcAvg(){
		return calcTot()/3;		//(kor+eng+mat)/3;
	}
	public void calcHak(){		//public String calHak
		if(calcAvg()>=90){
			System.out.println("A");
		}else if (calcAvg()>=80){
			System.out.println("B");
		}else if(calcAvg()>=70){
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	}
	public void calcRes(){
		if(calcAvg()>=80){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
	}
}
