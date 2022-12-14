package sec1;

public class MemberEx {

	public static void main(String[] args) {
		//클래스명 인스턴스명 = new 생성자 함수  	 생성자는 클래스 이름과 같아야한다
		//기본생성자는 선언을 하지 않아도 묵시적으로 들어가 있음
		Member mem1 = new Member();
		mem1.setId("Peace");
		mem1.setPassword("1234");
		System.out.println("아이디 : "+mem1.getId());
		System.out.println("비밀번호 : "+mem1.getPassword());
		System.out.println("전화번호 : "+mem1.getTel());
		Member mem2 = new Member();
		mem2.setId("kkk");
		System.out.println("아이디 : "+mem2.getId());
		
		Member mem3 = new Member("kkt","김기태","01011112222");
		System.out.println("아이디 : "+mem3.getId());
		System.out.println("이름 : "+mem3.getName());
		System.out.println("전화번호 : "+mem3.getTel());
		
		MemberController mc = new MemberController();
		mc.join("ppeace", "1216", "박평화");
		mc.info();
		mc.login("ppeace", "1216");
		mc.info();
	}

}
