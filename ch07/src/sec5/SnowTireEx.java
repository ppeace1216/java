package sec5;

public class SnowTireEx {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;	//자동 형 변환
		
		snowTire.run();
		tire.run();
	}

}
