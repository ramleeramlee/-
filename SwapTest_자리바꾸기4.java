package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기4 {


	public static void print(String[] str) {
		System.out.println(Arrays.toString(str));
	}
	public static void main(String[] args) {
		String[] str = {"햄버거", "샌드위치", "커피"};
		print(str); //swap하기 전 배열출력
		
		swap(str, 0, 1); // 햄버거, 샌드위치 위치 바꾸기
		
		print(str); //swap하고 난 후 배열출력
	}	
	
	public static void swap(String[] str, int x, int y) {
		
		String temp = str[y];
		str[y] = str[x];
		str[x] = temp;
	}

}
