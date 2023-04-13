package 배열;

import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=1; i<=n; i++){
          if(i%2 != 0) {
              answer.add(i);
          } 
        }

        return answer;
    }
}
// ArrayList 사용해서 2로 나누었을 때 나머지가 0이 아니면 홀수이므로 
// if 조건으로 찾아서 list에 add한다