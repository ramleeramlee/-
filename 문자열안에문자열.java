package 문자열;

public class 문자열안에문자열 {

	public static void main(String[] args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		Solution1 sol = new Solution1();
		int answer = sol.solution(str1, str2); //1
		System.out.println(answer);
		
		System.out.println(str1.lastIndexOf("a", 3)); // 0~2까지 중에 a 마지막 위치
		System.out.println(str1.indexOf("z")); // 문자열 안에 없으면 -1로 리턴된다
	}

}

class Solution1 {
	   public int solution(String str1, String str2) {
	        int answer = 0;
	        if (str1.contains(str2)) {
				answer = 1;
			}else {
				answer = 2;
			}
	        return answer;
	    }
	}
