package 배열;

import java.util.*;

public class 배열뒤집기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		Solution2 sol = new Solution2();
		int[] answer = sol.solution(numbers); 
		System.out.println(Arrays.toString(answer));
	}

}

class Solution2 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        //반복문 이용해서
        //list에선 0부터 꺼내고 answer에 뒤에서부터 하나씩 넣어준다
        //뒤에서 부터 카운트해줄 별도의 변수가 필요(j변수), 맨 뒤에서부터 시작해야함
        
        int j = num_list.length - 1; // 뒤에서 부터 시작
        for(int i = 0; i < num_list.length; i++) {
        	answer[j] = num_list[i];
        	j--;
        }
        
        return answer;
    }
}