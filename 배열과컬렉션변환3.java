package 컬렉션;
import java.util.*;

public class 배열과컬렉션변환3 {

	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		stringPrint(s2);
		// 배열로 처리하기에 복잡할 땐 list로 하면 편하다
		// 검색, 수정, 인덱스의 작업 하기엔 asList()를 사용
		// asList()는 원본 배열을 가지고 처리하기때문에 길이와 관련된 
		// 추가, 삭제, 삽입은 불가능!!!
		// 추가, 삭제, 삽입 작업을 하려면 모든 기능을 가진 ArrayList를 새로 만들어주어야 함
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s2));
		
		//1. aaa가 포함되어 있나요?
		System.out.println(list.contains("aaa"));
		
		//2. 맨 뒤에 "fff"를 추가하기
		list.add("fff");
		System.out.println(list);
		
		//3. 원하는 index에 "ggg"를 삽입하기
		list.add(1, "ggg");
		System.out.println(list);
		
		//4. "ccc" 삭제하기
		list.remove("ccc");
		System.out.println(list);
		
		//배열로 옮겨야 한다면 새롭게 배열을 만들어서 옮겨야 함!!
		String[] s3 = new String[list.size()];
		for (int i = 0; i < s3.length; i++) {
			s3[i] = list.get(i);
		}
		stringPrint(s3);
	}
	
	
}





