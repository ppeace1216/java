package sec3;

public class MichelinTire extends Tire{
	public MichelinTire(String location, int maxRotation){
		super(maxRotation, location);
	}

	@Override
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+" 미쉐린 타이어 수명은 "+(maxRotation-accumulatedRotation)+" 남았습니다.");
			return true;
		} else {
			System.out.println("***** "+location+"미쉐린 타이어 펑크!! *****");
			return false;
		}
	}
}