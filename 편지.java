package 컬렉션;

import java.util.*;


public class 편지 {

	public static void main(String[] args) {
		String message = "I love you~";
		
		Solution2 sol = new Solution2();
		int answer = sol.solution(message);
		System.out.println(answer);
	}
}

class Solution2 {
    public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }
}
