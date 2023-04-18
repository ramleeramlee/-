package 컬렉션2;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] s = {"mislav", "stanko", "mislav", "ana"};
		String[] s2 = {"stanko", "ana", "mislav"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String x : s2) {
			map.put(x, 0); // 명단을 map에 넣자, count는 아직 안됨
		}
		for (String x2 : s) {
			map.put(x2, map.get(x2) + 1);
		}
		System.out.println(map);
		
		String answer = "";
		for (String key : map.keySet()) {
			if(map.get(key) == 0 || map.get(key) > 1) {
				answer += key;
			}
		}
		System.out.println(answer);
	}
}