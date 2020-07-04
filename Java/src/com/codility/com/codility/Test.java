package com.codility;

public class Test {
    public int solution(int[] A) {
        //A contains integers from -1000 to +1000, determine whether the product of all elements is
        //negative => -1
        //zero => 0
        //positive => 1
        int N = A.length;
        int neg = 0;
        for (int i = 0; i < N; i++) {
            if(A[i] < 0) {
                neg +=1;
            }else if (A[i]==0){
                return 0;
            }
        }
        if(neg % 2 == 0){
            return 1;
        }else{
            return -1;
        }
    }
}
