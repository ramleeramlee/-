package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 한번만등장한문자찾기 {

	public static void main(String[] args) {
		String s = "hello";
		//1. 문자열을 하나씩 구분
		//1-1. toCharArray()
		//1-2. split("")
		//1-3. charAt(index)
		//2. 어떤 문자들이 들어있는지 목록을 만든다
		// 중복을 없애려면 HashSet 사용
		HashSet<String> set = new HashSet<>();
		String[] s2 = s.split("");
		System.out.println(Arrays.toString(s2));
		for (String x : s2) {
			
				set.add(x); //set 사용하면 중복된 것은 안들어감
			}

		System.out.println(set.size());
		System.out.println(set); //[a,b,c,d]
		
		// 배열안에 set에 들어있는 요소가 1인 것만 찾으면 끝
		Object[] set2 = set.toArray();//{a,b,c,d}
		List<String> list = Arrays.asList(s2); //Collections.frequency 사용하기 위해서 컬렉션으로 바꿔줌
		String answer = "";
		for (Object x : set2) {
			if (Collections.frequency(list, x) == 1) { //Collections.frequency가 갯수구할때 가장 빠르다
				answer += x;
			} 
		}
		System.out.println(answer);
	}

}
