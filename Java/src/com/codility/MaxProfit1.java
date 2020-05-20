package com.codility;

public class MaxProfit1 {
    public int solution(int[] A){
        int N = A.length;
        if(N <2){
            return 0;
        }
        int maxProfit = 0;
        int maxSlice = 0;
        for (int i = 1; i < N; i++) {
            maxProfit = Math.max(0, maxProfit + A[i] - A[i-1]);
            maxSlice = Math.max(maxSlice, maxProfit);
        }
        if(maxSlice < 0){
            maxSlice = 0;
        }
        return  maxSlice;
    }
}
