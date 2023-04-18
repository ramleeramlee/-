package 컬렉션2;

import java.util.HashMap;

public class 문자열내p와y의개수동일 {

	public static void main(String[] args) {
		String s = "pPoooY";
		//대소문자 상관없이 p와 y의 개수가 동일하면 true/false
		//대문자 혹은 소문자로 전부 바꾸어서 계산
		
		String s2 = s.toLowerCase(); // 소문자로 변경
		String[] s3 = s2.split("");
		
		HashMap<String, Integer> map = new HashMap<>();
		for (String key : s3) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		System.out.println(map);
		System.out.println(map.get("p") == map.get("y"));
	}

}
