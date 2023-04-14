package 문자열;

public class 문자반복출력하기 {

	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		Solution2 sol = new Solution2();
		String answer = sol.solution(my_string, n);
		System.out.println(answer);
		
	}

}

class Solution2 {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] c = my_string.toCharArray();
        // String[] s = my_string.split(""); 와 같은 역할
        
        for (char x : c) { //{'h','e','l','l','o',} 
			for (int i = 0; i < n; i++) {
				answer = answer + x;
			}
		}
        return answer;
    }
}
