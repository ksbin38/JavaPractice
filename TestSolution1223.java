package test;

public class TestSolution1223 {
	
	public long solution(int a, int b) {
        long answer = 0;
        if (a == b) {
            answer = a;
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
