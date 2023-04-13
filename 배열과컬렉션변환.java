package 컬렉션;
import java.util.*;
public class 배열과컬렉션변환 {

	// static으로 print이름을 붙여서 함수를 만들어줌
	// 아무대나 사용가능
	public static void intprint(int[] array) {
		System.out.println(Arrays.toString(array));
	} 
	public static void Stringprint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	
	public static void main(String[] args) {
		int[] s = {5, 2, 1, 9, 10, 16, 29};
		Arrays.sort(s);
		intprint(s);
		
		String[] s2 = {"a", "b", "c", "a"};
		Stringprint(s2);
		
		// 배열에서 특정 문자를 찾고싶을 때 
		// List로 변형하면 for문을 사용하지 않고 가능!!!
		// .asList는 index를 변형시키는 add/remove를 제외한 다른 작업만 가능
		List<String> list = Arrays.asList(s2);
		System.out.println(list);
		System.out.println(list.contains("a"));
		//1. b삭제
		
		//2. c가 들어잇는 위치를 찾아보세요.
		System.out.println(list.indexOf("c"));
		//3. aaa가 들어있는 마지막 위치를 찾아보세요.
		System.out.println(list.lastIndexOf("a"));
		//4. 전체 내용 프린트
		System.out.println(list);
		//5. 맨 앞에 d삽입
		
		//6. 맨 뒤에 fff삽입
		
		//7. 인덱스2번의 내용을 g로 변경
		list.set(2, "g");
		//8. 전체 내용 프린트
		System.out.println(list);
		
		//제약이 없는 ArrayList를 다시 만들어주면 된다(추가, 삭제할때)
		List<String> list3 = new ArrayList<String>(Arrays.asList(s2));
		list3.add("haha"); //추가
		list3.remove("b"); //삭제
		System.out.println(list3);
		
		//배열에 한계가 있어서 List로 변환하여 다양한 처리 함
		//코딩테스트에서는 반환을 거의 배열로 하게 되어있음
		
		//.asList로 만든 list를 다시 배열로 만들 때 .toArray() 를 사용하면 됨
		String[] s3 = (String[])list.toArray();
		Stringprint(s3);
	}
	
}
