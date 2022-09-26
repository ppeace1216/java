package sec2;

public class CellPhoneEx {

	public static void main(String[] args) {
		CellPhone p1 = new CellPhone();
		p1.powerOn();
		p1.bell();
		p1.hangIn();
		p1.sendVoice("여보세여");
		p1.recieveVoice("안녕하세요~ 좋은 말씀 전하러...");
		p1.hangOut();
		p1.powerOff();

	}

}
