package com.codility;

public class PassingCars {
    public int solution(int[] A) {
        int N = A.length;
        int result = 0;
        for (int i = 0; i < N - 1; i++) {
            if (A[i] == 0) {
                for (int j = i + 1; j < N; j++) {
                    if (A[j] == 1) {
                        result++;
                    }
                }
            }
//            System.out.println("a/ i: " + i + " result: " + result);
        }
        return result;
    }
}
