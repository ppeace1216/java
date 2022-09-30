package sec2;
//티비에 인터넷 기능을 추가한 스마트티비를 만들때
public class SmartTV implements RemoteControl, Searchable{
	private int volume;
	
	@Override
	public void turnOn() {	
		System.out.println("스마트 티비를 켭니다");
	}
	@Override
	public void turnOff() {	
		System.out.println("스마트 티비를 끕니다");
	}
	public int getVolume() {return volume; }
	@Override
	public void setVolume(int volume){
		if(volume>RemoteControl.MAX_VOLUME){
			this.volume=RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
		System.out.println("현재 볼륨 : "+volume);
	}
	@Override
	public void search(String url) {	
		System.out.println("스마트 TV로 인터넷을 접속합니다.");
	}
	
}
