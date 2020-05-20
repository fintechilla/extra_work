package com.codility;

public class CountFactors {
    public int solution(int N){
        int count = 0;
        int half = (int) Math.floor(N/2);
        for (int i = 1; i <= half; i++) {
            if((N % i) == 0){
                count +=1;
            }
        }
        count +=1;
        return count;
    }
}
