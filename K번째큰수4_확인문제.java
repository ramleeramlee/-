package 컬렉션2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수4_확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); //2
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			int data = sc.nextInt();
			if( data == 0) {
				break;
			}else {
				list.add(data);
			}
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println(k + "번째 작은 수: " + list.get(k - 1));
	}

}
