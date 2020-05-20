package com.codility;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TestTemp {
    public int solution(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        if (A[N -1] <= 0){
            return 1;
        }
        if(N == 1 && A[0]> 0){
            return A[0] + 1;
        }else if(N == 1 && A[0]< 0){
            return 1;
        }
        int result = 0;
        boolean found = false;
        for (int i = 1; i < N; i++) {
            if (A[i] - A[i - 1] > 1) {
                result = A[i - 1] + 1;
                found = true;
                return A[i - 1] + 1;
            }
        }
        if (!found) {
            result = A[N - 1] + 1;
        }

        return result;
    }
}
