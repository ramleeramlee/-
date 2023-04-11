package 문자열;

public class 스트링비교 {

	public static void main(String[] args) {
		String s = "정길동";
		String s2 = "정길동";
		// String은 s를 프린트할 때 그 주소가 가르키는 char들 프린트되게
		// 재정의 되어있는 객체(toString() 오버라이드)
		
		System.out.println(s);
		System.out.println(s2);
		
		// String이 가르키는 char들이 동일한지 equals()
		System.out.println(s.equals(s2));
		//String이 들어있는 주소가 동일한지 비교 ==
		System.out.println(s == s2); // true???
		
		s = "김길동";
		System.out.println(s.equals(s2));
		System.out.println(s == s2); //s만 주소가 바뀌었기 때문에 false
		
		//String을 사용하는 것은 좋으나 값이 자주 변경되는 경우는 비요율적!!
		//String은 기존에 저장된 값이 있으면 새롭게 만드는 것이 아니고,
		//기존의 값이 들어있는 주소를 그냥 쓴다 
		//값이 변경되면, 새로운 공간을 할당한다
		
		StringBuilder builder = new StringBuilder();
		builder.append("송길동");
		System.out.println(builder);

	}

}
