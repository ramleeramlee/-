package 배열;

import java.util.*;

public class 배열두배만들기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		Solution1 sol = new Solution1();
		int[] answer = sol.solution(numbers); 
		System.out.println(Arrays.toString(answer));
	}

}

class Solution1 {
    public int[] solution(int[] numbers) {
        int[] answer = new int [numbers.length];// 2배해도 배열의 길이는 같으므로
        
        //1. 반복문 이용해서
        //2. numbers 배열 인덱스 0부터 하나씩 꺼내
        //3. 2배로 곱한 후
        //4. answer 배열 같은 위치에 넣는다
        for(int i = 0; i < numbers.length; i++) {
        	answer[i] = numbers[i] * 2;
        }
        return answer;
        
    }
}