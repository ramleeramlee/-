package 배열;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 중앙값구하기 {

	public static void main(String[] args) {
		// 배열개수 홀수일때
		// 가운데값 구하는 방법
		// 배열의 길이 / 2 >> ex) 5/2 = 2(인덱스 2가 가운데값이다)
		
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		// 배열에 들어간 하나의 값 : element(엘리먼트)
		String s2 = Arrays.toString(s);
		System.out.println(s2);
		
		
		
		// 1. 정렬 먼저
		Arrays.sort(s); //파괴형
		System.out.println(Arrays.toString(s));
		
		// 2. 중앙위치 구하기
		int center = s.length / 2;
		
		// 3. 배열의 중앙위치값 구하기
		int answer = s[center];
		System.out.println(answer);
	}

}
