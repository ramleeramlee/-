package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기 {

	public static void main(String[] args) {
		int[] num = {6,1,2,3,5,9};
		System.out.println(Arrays.toString(num));
		// num[0] -> 6 num[6] -> 9
		int temp = num[5]; //2. 임시변수로 9의 위치를 바꿔준다
		num[5] = num[0]; //1. 이렇게 하면 9가 6으로 덮어지므로
		num[0] = temp; //3. 9를 배열에 다시 넣어준다
		
		System.out.println(Arrays.toString(num));
	}

}
