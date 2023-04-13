package 배열;

import java.util.Arrays;

public class 배열로리턴 {

	public static void main(String[] args) {
		int money = 5500;
		
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(money);
		System.out.println(Arrays.toString(answer));

	}

}

class Solution3 {
    public int[] solution(int money) {
        int[] answer = {0,0}; //몇잔, 나머지돈
        // int[] answer = new int[2] 와 같다
        int price = 5500;
        answer[0] = money / price; //1잔구매가능
        answer[1] = money % price; //잔액
        return answer;
    }
}