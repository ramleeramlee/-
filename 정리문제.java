package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] min = new int[5];
		for (int i = 0; i < min.length; i++) {
			min[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(min); // 오름차순
		System.out.println("최소값은 " + min[0]);
		
//	1번	
		
		Random r = new Random(5);
		int[] s = new int[20];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(900); //0~999
		}
		int max = s[0];
		
		for (int x : s) {
			if (x > max) max = x;
		}
		System.out.println("최대값은 " + max);
		
//	2번	
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		
		System.out.println(s1.equals(s2));
		
		int n1 = s1.length();
		int n2 = s2.length();
		if(n1>n2) {
			System.out.println("s1이 더 크다");
		} else {
			System.out.println("s2가 더 크다");
		}
	
//  3번	
		
		String s3 = "나는 진짜 java programmer가 되었어";
		String result = s3.substring(6, 21);
		
		System.out.println(result);
		System.out.println(result.toUpperCase());
		
//	4번
		
		String s4 = "2056521";
		char result2 = s4.charAt(0);
		if (result2 == '1') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
//	5번
	} 
	
}
