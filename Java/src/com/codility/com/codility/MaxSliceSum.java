package com.codility;

public class MaxSliceSum {
    public int solution(int A[]){
        int absoluteMax = A[0];
        int localMax = A[0];
        int nextSum = 0;
        int currentElement = 0;
        int N = A.length;
        if(N == 1){
            return A[0];
        }

        for (int i = 1; i < N; i++) {
            currentElement = A[i];
            nextSum = localMax + currentElement;

            localMax = Math.max(currentElement, nextSum);
            absoluteMax = Math.max(absoluteMax, localMax);
        }
        return absoluteMax;
    }
}
