package com.codility;

import java.util.ArrayList;

public class Flags {
    public int solution(int[] A){
        int N = A.length;
        if(N == 1 || N == 2){
            return 0;
        }
        int count = 0;

        for (int i = 0; i < N -2; i++) {
            if(A[i + 1] > Math.max(A[i], A[i + 2])){
                count += 1;
            }
        }
        count = (int) Math.min(Math.floor(Math.sqrt(N)), count);
        return count;
    }
}
