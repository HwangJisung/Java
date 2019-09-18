package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		// if-else문 : 두가지 조건의 결과를 모두 커버하는 if문
		// if( 조건식 ){
		//	조건식이 참일때 실행되는 영역
		// } else {
		//	조건식이 거짓일때 실행되는 영역
		// }
		
		int num = 49;
		String str = "";
		
		if( num++ > 50) {
			str = "num은 50 이상의 수 입니다.";
		} else {
			str = "num은 50 미만의 수 입니다.";
		}
		
		System.out.println("결과 : " + str);
		
		// age라는 변수에 나이를 대입하고 
		// 30세 이상이면 합격. 그렇지 않으면 불합격을 출력
		int age = 39;
		
		if(age >= 30) {
			str = "합격!";
		} else {
			str = "불합격!";
		}
		
		System.out.println("결과 : " + str);
		
		// 위의 코드를 삼항연산자로 변경
		str = age >= 30 ? "합격" : "불합격";
		
		System.out.println("결과 : " + str);
	}
}
