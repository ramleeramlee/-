package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기3 {

	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}
	public static void main(String[] args) {
		int[] num = {6,1,2,3,5,9};
		print(num); //swap하기 전 배열출력
		
		swap(num, 0, 5); // swap(6, 9)
		
		print(num); //swap하고 난 후 배열출력
	}	
	
	public static void swap(int[] num, int idx1, int idx2) {
		System.out.println(num[idx1] + ", " + num[idx2]);
		int temp = num[idx2];
		num[idx2] = num[idx1];
		num[idx1] = temp;
		System.out.println(num[idx1] + ", " + num[idx2]);
	}

}
