package sec3;

public class Loop7 {		//이중for문
	public static void main(String[] args) {
		int[][] a = {{80,90,70},{49,50,30},{80,88,79},{90,100,96}};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i][0]+"\t"+a[i][1]+"\t"+a[i][2]);
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+"\t");		//println 이면 아래로만 주르륵 print로 바꿔줘야함
			}
			System.out.print("\n");
		}
	}
}
