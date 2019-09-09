package ex2_operator;

public class Ex1_Operator {
	public static void main(String[] args) {
		// 연산자(Operator)
		// 1. 최고연산자 : . ()
		// 2. 증감연산자 : ++ --
		// 3. 산술연산자 : + - * / %
		// 4. 시프트연산자 : >> << >>>
		// 5. 비교연산자 : > < >= <= == !=
		// 6. 비트연산자 : & | ^ ~
		// 7. 논리연산자 : && || !
		// 8. 조건(삼항)연산자 : ? :
		// 9. 대입연산자 : = *= /= %= += -=
		
		// 산술연산자
		// 산술연산자는 4칙연산자와 나머지 연산자로 이루어져 있다.
		int n1 = 20;
		int n2 = 7;

		System.out.println("n1 = "+ n1);
		System.out.println("n2 = "+ n2  + "\n");
		
		int n3 = n1 + n2;
		System.out.println("n1 + n2 = "+ n3);

		n3 = n1 * n2;
		System.out.println("n1 * n2 = "+ n3);

		n3 = n1 / n2;
		System.out.println("n1 / n2 = "+ n3);

		n3 = n1 % n2;
		System.out.println("n1 % n2 = "+ n3 + "\n");
		
		// 대입연산자
		// 특정 값을 변수에 전달하여 기억시킬 때 사용하는 연산자
		int n4 = 0;
		n4 += n1;
		System.out.println("n4 = "+ n4);
		
		n4 *= n1;
		System.out.println("n4 = "+ n4);
		
		n4 /= n1;
		System.out.println("n4 = "+ n4);
		
		n4 %= n1;
		System.out.println("n4 = "+ n4);
	}
}
