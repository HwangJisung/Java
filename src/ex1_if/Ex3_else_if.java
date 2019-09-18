package ex1_if;

public class Ex3_else_if {
	public static void main(String[] args) {
		// 다중if문( else-if ) : 여러개의 조건 비교가 필요할 때 사용하는 제어문
		int num = 75;
		String str = "";
		
		if(num >= 90) {
			str = "내 성적은 수";
		} else if (num >= 80) {
			str = "내 성적은 우";
		} else if (num >= 70) {
			str = "내 성적은 미";
		} else if (num >= 60) {
			str = "내 성적은 양";
		} else {
			// if와 else if의 모든 조건이 거짓일때 반드시 실행되는 영역
			str = "내 성적은 가";
		}
		
		System.out.println( str );
		
	}
}
