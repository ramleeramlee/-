package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;

public class K번째큰수2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력할 개수가 주어지지 않을 떄 size사용!!
		int size = sc.nextInt(); //입력할 개수
		int k = sc.nextInt(); // k번째 큰수
		int[] num = new int[size];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
		// 일단 정렬한 뒤 k번째 위치 찾을 것
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(k + "번째 큰 수: " + num[num.length - k]);
	}

}
