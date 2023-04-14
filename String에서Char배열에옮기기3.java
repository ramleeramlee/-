package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String에서Char배열에옮기기3 {

	public static void print(String[] s) {
		System.out.println(Arrays.toString(s));
	}
	
	public static void main(String[] args) {
		String sno = "2056521"; 
		
		//1. 마지막 위치의 숫자가 1이면 서대문구에서 출생
		// 		1이 아니면 다른 구에서 출생
		if (sno.charAt(sno.length() - 1) == '1') {
			System.out.println("서대문구 출생");
		} else {
			System.out.println("다른 구 출생");
		}
		
		//2. 52를 추출하여 두 숫자를 더해라
		//		더해서 10이 넘지않아야 유효한 주민번호이고 인지아닌지 출력
		char[] two = new char[2];
		sno.getChars(4, 6, two, 0);// sno에서 4~5를 추출해서 two에 0번부터 넣어주세요
		System.out.println(Arrays.toString(two));
		
		int i1 = Character.getNumericValue(two[0]); //char을 int로 바꿔줌
		int i2 = Character.getNumericValue(two[1]);
		int sum = i1 + i2;
		System.out.println(sum);
		if (sum < 10) {
			System.out.println("유효");
		} else {
			System.out.println("유효하지않음");
		}
		
		//3. 주민번호에 5의 갯수 프린트
		//String안에 들어있는 데이터를 각각 분리 해주어야 한다
		// 1) String배열 - split()
		String[] stringArray = sno.split("");
		int count = 0;
		for (String s : stringArray) {
			if (s.equals("5")) {
				count++;
			}
		}
		System.out.println(count);
		
		// 2) charAt(i) for문 돌리기
		int count2 = 0;
		for (int i = 0; i < sno.length(); i++) {
			char c = sno.charAt(i);
			if (c == '5') {
				count2++;
			}
		}
		System.out.println(count2);
		
		
		
		//인덱스를 빨리 찾는 방법(함수사용)
		System.out.println(Arrays.binarySearch(stringArray, "5"));
		
		//배열에 특정한 값을 한꺼번에 변경할 수 있는 함수
		Arrays.fill(stringArray, 0, 3, "hoho");//인덱스 0번부터 3개변경
		//System.out.println(Arrays.toString(stringArray));
		print(stringArray);
		
		//배열의 순서를 다 뒤집는 방법(함수)
		 Arrays.sort(stringArray);// 오름차순
		 //System.out.println(Arrays.toString(stringArray));
		 print(stringArray);
		//내림차순은 Arrays 사용보다 걸렉션이 더 간단!!!!
		List<String> list = Arrays.asList(stringArray);
		Collections.sort(list); //오름차순 해준다음
		Collections.reverse(list); //내림차순 해준다
		System.out.println(list);
		
		//배열안에 데이터의 빈도수(횟수)구하는 방법(함수)
		int count3 = Collections.frequency(list, "hoho");
		System.out.println(count3);
	}

}



