package 배열;

import java.util.*;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		int n = 15;
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(n); 
		System.out.println(Arrays.toString(answer));
	}

}

class Solution3 {
    public int[] solution(int n) {
    	//answer 배열 개수는 n값이 짝수 => 1/2개,  홀수 => 1/2 + 1(자기자신)개 
    	
        int size = 0;
        if(n % 2 != 0) {
        	size = (n/2) + 1;
        }else {
        	size = n/2;
        }
        int[] answer = new int[size];
        
        for (int i = 0; i < size; i++) {
			answer[i] = (i * 2) + 1;
		}
        return answer;
    }
}