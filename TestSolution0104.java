package test;

public class TestSolution0104 {
	
	public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = 0; j < arr.length; j++) {
        		if (numbers[i] == arr[j]) {
        			arr[j] = -1;
        		}
        	}
        }
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] >= 0) {
        		answer += arr[i];
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
