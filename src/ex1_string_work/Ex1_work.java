package ex1_string_work;

public class Ex1_work {
	public static void main(String[] args) {
		
		//아래 input에 소문자 a가 몇개 포함되어 있는지 화면에 출력
		String input = "asfasdfjkasdjf;kjasd;kfj;askdjf;askjdf;lkaj";
		int cnt = 0;
		
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i) == 'a')
				cnt++;
		}
		System.out.println("a의 갯수 : " + cnt);
	}
}
