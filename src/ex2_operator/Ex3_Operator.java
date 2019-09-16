package ex2_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
		// 증감연산자
		// 1씩 증가시키거나 1씩 감소시키는 연산자
		// 선행 증감과 후행 증감의 차이점을 기억
		int a = 10;
		
		System.out.println("++a :" + ++a);
		
		int b = 10;
		System.out.println("b++ :" + b++);
		System.out.println("b :" + b);
		
		// 삼항(조건)연산자
		// 하나의 조건을 정의하여 그 조건이 참일때와 거짓일때에 대한 결과를 모두 돌려받기 위한 연산자 :
		
		int n1 = 10;
		int n2 = 15;
		
		boolean result;
		result = ++n1 >= n2 ? true : false;
		
		System.out.println("result :" + result);
		
		char res = (n1 += n1) != n2 ? 'O' : 'X';
		
		System.out.println("res : " + res);
		
		a = 10;
		b = 12;
		int c = ++a >= b || 2 + 7 <= b && 13 - b > 0 && ( a += b) > 22 ? 1 : 2; // 1
		
		System.out.println("c : " + c);
				
	}
}
