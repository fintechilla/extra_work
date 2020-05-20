package com.codility;

public class MaxProfit {
    public int solution(int[] A) {
        int N = A.length;
        int maxProfit = -1;
        int result = -1;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i; j < N; j++) {
                int tempProfit = A[j] - A[i];
                if (tempProfit > maxProfit) {
                    maxProfit = tempProfit;
                }
            }
        }
        if (maxProfit < 0){
            result = -1;
        }else {
            result = maxProfit;
        }
        return result;
    }
}
