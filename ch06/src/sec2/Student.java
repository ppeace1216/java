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
		return this.kor+this.eng+this.mat;
	}
	//public double calcAvg(){
	//	return calcTot/3;
	//}
	//public double calcHak(){
	//	if(calcAvg>=90){
			
	//	}
	//}
}
