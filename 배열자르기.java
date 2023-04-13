package 배열;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열자르기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		
		Solution6 sol = new Solution6();
		int[] answer = sol.solution(numbers, num1, num2);
		System.out.println(Arrays.toString(answer));

	}

}

class Solution6 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int size = num2 - num1 +1;
        int[] answer = new int[size]; // {0, 0, 0} //0~2
        
        // 1. 반복문 돌려서 답이 들어가는 배열(0~2)에 하나씩 넣어주어야 함 
        // 2. numbers의 num1부터 num2까지 하나씩 꺼내서 //1~3
        for (int i = 0; i < size; i++) { //0~2
			answer[i] = numbers[num1]; //numbers의 num1번째 배열숫자가 answer의 0번째에 들어감
			num1++; //2 (numbers의 num1+1 = 배열 2번째 숫자가 answer의 1번째 들어감)
		}
       
        return answer;
    }
}