package 문자열;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		String answer = "";
		String my_string = "Bcad";
		
		//.toLowerCase()는 대문자를 모두 소문자로 바꿔준다
		char[] c = my_string.toLowerCase().toCharArray();
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	
	}

}
