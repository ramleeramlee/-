package 프로그래머스;

public class 배열의평균 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		double answer = sol.solution(numbers); //int[]
		System.out.println(answer);
	}

}

class Solution3 {
    public double solution(int[] numbers) {
    	//System.out.println(numbers.length);
    	int size = numbers.length;
    	// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
    	
    	int sum = 0;
    	for (int x : numbers) {
			sum = sum + x;
		}
    	//System.out.println((double)sum / size);
        double answer = (double)sum / size;
        return answer;
    }
}