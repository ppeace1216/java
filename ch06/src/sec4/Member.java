package sec4;

public class Member {
	//private String name;	//멤버 필드(Field = Attribute = Property)
	String name;
	String id;
	String password;
	int age;
	
	public Member(String name){}	//생성자 (Constructor)
	public Member(String name,String id){
		this.name=name; this.id=id;	//14번 문제
	}
	
	public void setName(String name){}	//메소드(Method)
}
