package ex3_label;

public class Ex2_label_break {
	public static void main(String[] args) {
		outer : for(int i=1; i<=5; i++) {
			switch (i) {
			case 1:
				System.out.println("1���");
				break;
			case 2:
				System.out.println("2���");				
				break;
			case 3:
				System.out.println("3���");
				break outer;
			case 4:
				System.out.println("4���");
				break;
			case 5:
				System.out.println("5���");				
				break;
			default:
				break;
			}
		}
	}
}
