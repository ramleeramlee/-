package 배열;

import java.util.Arrays;

public class 머쓱이키 {

	public static void main(String[] args) {
		int[] array = {149, 180, 192, 170};
		int height = 167;
		Solution sol = new Solution();
		int answer = sol.solution(array, height);
		System.out.println(answer);

	}

}

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0; //count
        for (int x : array) {
			if (x > height) {
				answer++;
			}
		}

        return answer;
    }
}