package ex2_switch;

public class Ex4_switch {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		char op = '+';
		
		int result = 0;
		
		switch (op) { // + - * / %
		case '+':
			result = num1 + num2 ;
			break;
		case '-':
			result = num1 - num2 ;			
			break;
		case '*':
			result = num1 * num2 ;
			break;
		case '/':
			result = num1 / num2 ;
			break;
		case '%':
			result = num1 % num2 ;			
			break;
		default:
			break;
		}
		System.out.println("op : " + op + " result = " + result);
		
	}
}
