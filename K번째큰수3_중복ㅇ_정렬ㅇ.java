package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수3_중복ㅇ_정렬ㅇ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력할 개수가 주어지지 않을 떄 size사용!!
		int size = sc.nextInt(); //입력할 개수
		int k = sc.nextInt(); // k번째 큰수
		
		TreeSet<Integer> set = new TreeSet<>(); //오름차순
		//TreeSet<Integer> name = new TreeSet<>(Collections.reverseOrder()); //내림차순
		for (int i = 0; i < size; i++) {
			set.add(sc.nextInt());
		}
		System.out.println(set);
		Object[] result = set.toArray();
		System.out.println(result[result.length - k]);
	}

}
