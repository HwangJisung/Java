package ex3_label;

public class Ex2_label_break {
	public static void main(String[] args) {
		outer : for(int i=1; i<=5; i++) {
			switch (i) {
			case 1:
				System.out.println("1출력");
				break;
			case 2:
				System.out.println("2출력");				
				break;
			case 3:
				System.out.println("3출력");
				break outer;
			case 4:
				System.out.println("4출력");
				break;
			case 5:
				System.out.println("5출력");				
				break;
			default:
				break;
			}
		}
	}
}
