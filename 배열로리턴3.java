package 배열;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열로리턴3 {

	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		Solution5 sol = new Solution5();
		int[] answer = sol.solution(arr, divisor);
		System.out.println(Arrays.toString(answer));

	}

}

class Solution5 {
    public int[] solution(int[] arr, int divisor) {
        //수도코드(가짜코드)
        // 1. 결과를 넣을 수 있는 List를 만든다
        // 2. 반복문 이용해서 배열에 있는 요소 하나씩 꺼내
        // 3. divisor로 나누었을 때 나머지가 없는지 체크하고 
        //    나머지가 없으면 list에 모으자
        
        ArrayList<Integer> list = new ArrayList<>();
       for (int i = 0; i < arr.length; i++) {
    	   if (arr[i] % divisor == 0) {
			 list.add(arr[i]);
		}
	}   
       // int값 list를 배열에 자동으로 넣어주는 함수는 없다!!!!
       // 손으로 일일이 넣어주어야 함
       
       int[] answer = null; 
       if(list.size() != 0) {
    	   answer = new int[list.size()];
           for (int i = 0; i < list.size(); i++) {
    	     answer[i] = list.get(i);
	}
       }else {
    	   answer = new int[1];
    	   answer[0] = -1;
       }
       Arrays.sort(answer);
        return answer;
    }
}