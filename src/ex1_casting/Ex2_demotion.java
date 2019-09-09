package ex1_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		// 디모션 캐스팅
		// - 작은 자료형에 큰 자료형을 대입하는 것
		char c = 'B';
		int n = c + 2;

		System.out.println("n: " + n);
		
		c = (char)n;
		System.out.println("c: " + c);
		
		float ff = 5.5f;
		short s = 1;

		System.out.println("ff: " + ff);
		s = (short)ff;

		System.out.println("s: " + s);
		
	}
}
