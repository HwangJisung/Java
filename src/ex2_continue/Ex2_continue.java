package ex2_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		for(int i = 0; i < 2; i++) {
			switch(i) {
			case 0:
				System.out.println("0을 출력합니다.");
				continue;
			case 1:
				System.out.println("1을 출력합니다.");
				continue;
			case 2:
				System.out.println("2를 출력합니다.");
				continue;
			
			}
		}
	}
}
