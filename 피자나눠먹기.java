package 프로그래머스;

public class 피자나눠먹기 {

	public static void main(String[] args) {
		int n = 30;
		Solution3 sol = new Solution3();
		int answer = sol.solution(n); //1
		System.out.println(answer);
	}

}

class Solution3 {
	   public int solution(int n) {
	        int answer = 0;
	        if (n < 7) {
				answer = 1;
			}else if (n % 7 == 0) {
				answer = n/7;
			}else if (n > 7) {
				answer = n/7 + 1;
			}
	        return answer;
	    }
	}