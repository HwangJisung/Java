package ex1_break;

public class Ex4_break {
	public static void main(String[] args) {
		int n=1;
		
		while( true ) {
			if(n > 2) {
				break;
			}
			
			System.out.println(n);
			n++;
		}
	}
}
