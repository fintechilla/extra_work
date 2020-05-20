package com.codility;

public class MaxProductOfThree {
    public int solution(int[] A) {
        int result = A[0] * A[1] * A[2];
        int N = A.length;
        int tempProd = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N - 1; j++) {
                for (int k = 0; k < N; k++) {
                    tempProd = A[i] * A[j] * A[k];
                    if (tempProd > result) {
                        result = tempProd;
                    }
                }
            }

        }
        return result;
    }
}
