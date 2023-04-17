package 문자열;

public class 문장속긴단어출력 {

	public static void main(String[] args) {
		String s = "i love you";
		//1. 배열에 한 단어씩 넣기
		String[] s2 = s.split(" ");
		//2. 최대길이를 넣을 수 있는 max변수 선언
		int max = s2[0].length();
		//3. 최대길이를 가지는 String을 넣어줄 수 있는 maxString변수 선언
		String maxString = s2[0];
		//4. for문 돌려서 하나씩 꺼내어
		//max보다 크면, 글자길이 값을 max에 넣어주고 해당글자를 maxString에 넣어준다
		for(String x : s2) {
			if(x.length() > max) {
				max = x.length();
				maxString = x;
			}
		}
		System.out.println(maxString);
		
	}

}
