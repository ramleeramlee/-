package 컬렉션2;

import java.util.Arrays;

public class K번째큰수 {

	public static void main(String[] args) {
		int[] num = { 3, 4, 5, 1, 2 };
		int k = 2; //2번째 큰수
	
		// 일단 정렬한 뒤 k번째 위치 찾을 것
		Arrays.sort(num);
//		for (int x : num) {
//			System.out.println(x);
//		}
		
		System.out.println(Arrays.toString(num));
		
		System.out.println("제일 큰 수: " + num[num.length -1]);
		System.out.println(k + "번째 큰 수: " + num[num.length - k]);
	}

}
