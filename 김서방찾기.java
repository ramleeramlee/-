package 문자열;

public class 김서방찾기 {

	public static void main(String[] args) {
		String[] s = {"Jane", "Kim"};
		String answer = "";
		int findIndex = 0;
		
		//kim이 어디 있는지 위치 찾기
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("Kim")) {
				findIndex = i;
			}
		}

		answer = findIndex + "번째";
		System.out.println(answer);
	}

}
