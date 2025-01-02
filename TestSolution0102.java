package test;

public class TestSolution0102 {
	
	public int solution(int n) {
        int answer = 0;
        int[] num = new int[n+1];
        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i < n+1; i++) {
            num[i] = (num[i-2] + num[i-1]) % 1234567;
        }
        answer = num[n];
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
