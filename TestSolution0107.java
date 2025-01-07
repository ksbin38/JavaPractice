package test;

import java.util.*;

public class TestSolution0107 {
	
	// 배열과 수를 입력받고 배열의 숫자 중 divisor로 나눴을 때 나누어 떨어지는 숫자만 오름차순으로 정렬해서 출력
	// 단, 나누어 떨어지는 숫자가 없다면 answer에 -1만 넣어서 출력
	public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) answer.add(arr[i]);
        }
        if(answer.isEmpty()) answer.add(-1);
        else Collections.sort(answer);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
