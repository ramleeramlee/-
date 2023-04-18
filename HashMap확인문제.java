package 컬렉션2;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		String v = "apple, banana, apple, banana, melon, apple";
		
		String[] v2 = v.split(", ");
		
		HashMap<String, Integer> map = new HashMap<>();
		for (String key : v2) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		System.out.println(map);
		
		int max = 0;
		String xx = "";
		for (String x : map.keySet()) {// key의 목록을 String으로 가져온다
			if (map.get(x) > max) {
				max = map.get(x);
				xx = x;
			}
		}
		System.out.println(xx + "의 득표수 " + max);
		System.out.println(map.keySet());
	}

}
