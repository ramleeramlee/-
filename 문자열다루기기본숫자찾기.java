package 문자열;

import java.util.Arrays;

public class 문자열다루기기본숫자찾기 {

	public static void main(String[] args) {
		String s = "a234";
		boolean answer = true;
		
		// 0. 4글자, 6글자인지 판단해서 맞으면 실행하기
		// 글자수 구하기
		int size = s.length();
		if (size == 4 || size == 6) {
			// 1. 글자 하나씩 떨어뜨려라
			// for문 돌려서 하나씩 꺼낸 다음
			// 글자하나하나가 0~9사이인지 확인
			char[] c = s.toCharArray();
			System.out.println(Arrays.toString(c));
			
			for (char x : c) {
				if(x < '0' || x > '9') {
					answer = false;
					break;
				}
			}
					
		}else {
			answer = true;
		}
		System.out.println(answer);
		
		
		
		//2. 숫자로 바꾸어서 에러가 생기면 문자가 포함되어 있음
		if(size == 4 || size == 6) {
			try {
				//String을 int로 바꾸어서 에러생기는지 확인
				//에러가 있음 문자가 포함되어 int로 바꿀 수 없다는 의미
				Integer.parseInt(s); //"a234"
				// 에러가 발생했을 때 프로그램이 중단되고, 에러메세지를 프린트
				//하지만 에러상황 캐치해서 내가 임의로 처리한 후 
				//프로그램 중단하지 않고 계속 실행하고 싶을 때 try_catch
			} catch (Exception e) {
				answer = false;
			}
		}else {
			answer = true;
		}
		System.out.println(answer);
	}

}
