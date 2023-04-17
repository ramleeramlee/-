package 문자열;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("honghong");
		System.out.println(sb1);
		
		StringBuilder sb11 = new StringBuilder("honghong");
		System.out.println(sb11);
		
		StringBuilder sb2 = new StringBuilder("honghong");
		System.out.println(sb2);
		
		System.out.println(sb1 == sb2);
		
		sb1.append("hahaha");
		System.out.println(sb1);
		sb1.replace(0, 8, "yoyoyo");
		System.out.println(sb1);
		sb1.delete(0, 8);
		System.out.println(sb1);
		sb1.deleteCharAt(1); //특정자리글자한개 삭제
		System.out.println(sb1);
		sb1.reverse(); //역정렬
		System.out.println(sb1);
		
		// builder에 있는 글자는 .split를 사용할 수 없기 떄문에 
		//.toString으로 한번 바꿔준 뒤 사용할 수 있다
		String sb3 = sb1.toString();
		String[] s4 = sb3.split("");
		 
		
	}

}
