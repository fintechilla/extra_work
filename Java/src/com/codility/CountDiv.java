package com.codility;

public class CountDiv {
    public int solution(int A, int B, int K){


        int n = 0;
        if ((A >= B)|| (K == 0) || (K > B)){
            return n;
        }
        int fstDivByK = 0;
        for (int i = 0  + A; i <= B; i++) {
            if (i % K == 0){
                fstDivByK = i;
                break;
            }
        }
        int diff = B - fstDivByK ;
        n = (int) Math.floor(diff / K) + 1;

        return n;
    }
}
