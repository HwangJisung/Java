package ex1_break;

public class Ex1_break {
	public static void main(String[] args) {
		// break문 : 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져나가기 위해 사용하는 키워드
		
		for(int i=0; i <=5; i++) {
			
			if(i == 3) {
				System.out.println("if문이 true다!!");
				break;
				// break문 아래는 그 어떤 코드는 동작시킬수 없다.
			}
			System.out.println(i);
		}
	}
}
