package ex2_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		
		// 비교 연산자
		// 변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		int n1 = 10;
		int n2 = 20;
		
		boolean result = false;
		boolean result2 = false;
		
		result = n1 == n2;
		result2 = n1 > n2;
				
		if(result)
		{
			System.out.println("같다!");
		} else
		{
			System.out.println("틀리다!");
		}

		if(result2)
		{
			System.out.println("n1이 크다!");
		} else
		{
			System.out.println("n2가 크다!");
		}
		
		// 논리 연산자
		// 비교 연산자를 통한 연산이 두 개 이상 필요할 때 사용한다.
		int myAge = 20;
		int limit = 25;
		
		boolean result3 = false;
		
		result3 = limit - myAge >= 5 && myAge >20;
		
		if(!result3)
		{
			System.out.println("result3: " + result3);
		}
		
		int i1 = 10;
		int i2 = 20;
		
		boolean  result4 = false;
		
		result4 = (i1 += 10) > 20 || i2 - 10 >= 10;
		
		if(result4)
		{
			System.out.println("result4 :" + result4);
		}
		
		// not 연산자(!) : true를 false로, false를 true로 변경
		System.out.println("!result4 :" + !result4);
	}
}
