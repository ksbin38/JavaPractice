package test;

public class TestSolution0103 {
	
	public int solution(int n) {
        int answer = 0;
        int a = 1; // 몫
        int x = 100000000; // 자릿수 구하려는 값
        while (true) {
            a = (n / x) >= 1 ? (n / x) : 0; // 자릿수에 맞게 몫 구하기
            answer += a; // 자릿수 합
            n -= a * x; // 다음 자릿수를 위해 계산된 값은 뺄셈
            if (x == 1) break; // 마지막 자리까지 계산 시 반복문 탈출
            x /= 10; // 다음 자릿수로 넘어가기 위한 나눗셈
        }

        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
