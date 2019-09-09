package ex1_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		// 캐스팅(형변환)
		// 1. 프로모션 캐스팅
		// - 큰 자료형에 작은 자료형을 대입하는 것(자동)
		double d = 100.5;
		int n = 200;
		d=n;
		
		System.out.println(d);
	}
}
