package ex2_value_type;

public class Ex1_value {
	public static void main(String[] args) {
		// 기본자료형(valueType)
		// 논리형 : boolean
		// 문자형 : char  
		// 정수형 : byte(1), short(2), int(4), long(8) 
        // 실수형 : float(4), double(8)
		
		// 변수 : 특정값을 저장하여 기억시킬때 사용하는 공간
		
		// 1. 같은 이름의 변수는 여러개 만들 수 없다.
		// 2. 변수명은 숫자로 시작할 수 없다.
		// 3. _를 제외하고 특수문자를 사용할 수 없다.
		// 4. 한글로 변수명을 작성하지 않는다.
		
		// 논리형 : true , false 즉, 참과 거짓의 두가지 값 만을 저장할 수 있는 자료형
		boolean bool = false;
		
		if(bool) System.out.println("bool : " + bool);
		else System.out.println("bool : " + bool);
		
		
		// 문자형 : 홑따옴표 안에 딱 한글자를 저장하는 자료형
		char ch = 'A';		
		System.out.println("char : " + ch);
		
		// 정수형
		byte by = 127;
		System.out.println("byte : " + by);
		
		short s = 32767;
		System.out.println("short : " + s);
		
		long l = 2200000000L;
		System.out.println("long : " + l);
		
		int a = 2100000000; 
		int b = 200;
		
		int c = a+b;
		System.out.println("int : " + c);
		
		// 실수형
		float f = 3.14f;
		System.out.println("float :" + f);
		
		double d = 3.14195;
		System.out.println("double :" + d);					
	}
}
