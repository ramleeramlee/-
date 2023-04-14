package 문자열;

public class 함수만들기연습2 {

	public static void 세수하기() {
		System.out.println("미지근한물로 세수");
		System.out.println("스킨로션 바르기");
	}
	public static void 밥먹기(String food) {
		System.out.println(food + "밥 먹기");
		
	}
	public static void 운동하기(String where) {
		System.out.println("스트레칭 필수");
		System.out.println(where + "에서 운동");
	}
	public static void 잠자기() {
		System.out.println("자기전 양치필수");
		System.out.println("잠옷입고 잔다");
	}
	
	public static void main(String[] args) {
		// 내가 일어나서 하는 일
		//1. 세수하기
		//2. 밥먹기(아침)
		//3. 운동하기(운동장)
		//4. 잠자기(낮잠)
		//5. 밥먹기(점심)
		//6. 세수하기(외출준비)
		//7. 화장하기
		//8. 밥먹기(저녁)
		//9. 운동하기(공원)
		//10. 잠자기(저녁)
		
		세수하기();
		밥먹기("아침");
		운동하기("운동장");
		잠자기();
		밥먹기("점심");
		세수하기();
		System.out.println("선크림까지만 바르쟈" );
		밥먹기("저녁");
		운동하기("공원");
		잠자기();
	}

}
