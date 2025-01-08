package test;

import java.util.*;

public class TestSolution0108 {
	
	// 길이가 같은 배열 A, B를 입력받고 각각 한 개의 숫자를 뽑다 두 수를 곱하고 곱한 값을 누적하여 더한다.
	// 최종적으로 누적된 값이 최소가 되도록 만들어라.
	public int solution(int []A, int []B)
    {
        int answer = 0;
        ArrayList<Integer> listA = new ArrayList<Integer>();
        ArrayList<Integer> listB = new ArrayList<Integer>();

        // 새 배열을 생성 후 대입
        for(int i = 0; i < A.length; i++) {
            listA.add(A[i]);
            listB.add(B[i]);
        }
        // 새로 대입한 배열을 오름차순으로 정렬
        Collections.sort(listA);
        Collections.sort(listB);

        // 배열A는 작은 수부터, 배열B는 큰 수부터 뽑아 곱한 값을 answer에 더한다.
        for(int i = 0; i < listA.size(); i++) {
            answer += (listA.get(i) * listB.get(listB.size() - (1 + i))); 
        }
        
        // 더 간단한 풀이
//        // 배열A와 배열B를 오름차순으로 정렬
//        Arrays.sort(A);
//        Arrays.sort(B);
//        
//        // 배열A는 작은 수부터, 배열B는 큰 수부터 뽑아 곱한 값을 answer에 더한다.
//        for(int i = 0; i < A.length; i++) {
//        	answer += (A[i] * B[(B.length - (1 + i))]); 
//        }

        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
