package ex2_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		// 출력 포맷을 지정하는 printf()
		System.out.printf("%d * %d = %d\n",2,1,2);
		System.out.println("==========");
		
		//2019-09-20
		//2019/09/20
		int year = 2019;
		int month = 9;
		int day = 20;
		
		System.out.printf("%d-%02d-%d\n",year,month,day);
		System.out.println("==========");
		System.out.printf("%d/%02d/%d\n",year,month,day);
		System.out.println("==========");
		
		/*
		 * %d : 정수 데이터만 출력
		 * %c : 문자 데이터만 출력 
		 * %s : 문자열 데이터 출력
		 * %f : 실수 데이터 출력
		 * */
		// 홍길동님은 3.7학점으로 A에 해당됩니다.
		
		String name = "홍길동";
		float score = 3.7f;
		char res = 'A';
		
		System.out.printf("%s님은 %.1f학점으로 %c에 해당됩니다.",name,score,res);
	}
}
