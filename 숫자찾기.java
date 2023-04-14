package 문자열;

import java.util.*;


public class 숫자찾기 {

	public static void main(String[] args) {
		int num = 29183;
		int k = 1;
		Solution sol = new Solution();
		int answer = sol.solution(num, k);
		System.out.println(answer);
		
		
	}
}

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String num2 = String.valueOf(num);
        String k2 = String.valueOf(k);
        
       if (num2.contains(k2)) {
    	answer = num2.indexOf(k2) + 1;
	}  else {
		answer = -1;
	} 
        return answer;
    }
}
