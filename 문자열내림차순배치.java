package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순배치 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		
		
		//1. 내림차순으로 정렬 한 다음
		//2. for문 이용해서 하나씩 꺼낸 후
		//3. answer에 붙인다
		
		// ArrayList, 배열로 바꾸려면 문자들을 하나씩 떨어뜨려야 한다
		String[] s2 = s.split("");
		List<String> list = Arrays.asList(s2);
		Collections.reverse(list);
		System.out.println(list);
		
		for (String x : list) {
			answer = answer + x; // answer += x;
		}

		System.out.println(answer);
	}

}
