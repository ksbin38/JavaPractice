package test;

public class TestSolution1230 {
	
	public int solution(int n) {
        int answer = 1;
        for (answer = 1; answer < n; answer++) {
            if (n % answer == 1) break;
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
