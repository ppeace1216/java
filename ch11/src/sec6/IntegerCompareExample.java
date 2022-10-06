package sec6;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println( obj1 == obj2);
		System.out.println( obj3 == obj4);
	}
	 // int값이 -128 ~ 127 사이라면 내부의 값을 비교 가능하지만 범위를 벗어나면 객체의 번지를 비교하기 때문이다.
	// -128~127 범위(1바이트 범위)의 데이터는 비교하면 같다고 출력되지만 해당 범위를 벗어난 데이터는 비교가 서로 다른 값으로 이루어짐
}
