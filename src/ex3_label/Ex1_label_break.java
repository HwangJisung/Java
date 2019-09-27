package ex3_label;

public class Ex1_label_break {
	public static void main(String[] args) {
		// label break, label continue : 
		// 가장 가까운 반복문을 빠져나오거나 건너뛰는 일반 break, continue와 달리 
		// 특정 반복문에 이름을 지정하여 한번에 두개 이상의 반복문을 제어할 수 있도록 하는 기법
		out : for(int i=1; i <=3; i++) {
			for(int j=1; j <=10; j++) {
				if( j % 3 == 0) {
					break out; // out for 문에 break가 걸려서 빠져나감
				}
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
