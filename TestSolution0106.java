package test;

import java.util.*;

public class TestSolution0106 {
	
	public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int min = arr[0];
        if(arr.length == 1) {
        	answer.add(-1);
        } else {
        	for(int i = 0; i < arr.length; i++) {
    			if(arr[i] <= min) min = arr[i];
        	}
        	for(int i = 0; i < arr.length; i++) {
        		if(min != arr[i]) {
        			answer.add(arr[i]);
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
