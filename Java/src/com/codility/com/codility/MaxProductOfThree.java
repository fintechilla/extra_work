package com.codility;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        long result;
        int n = A.length;

        Arrays.sort(A);
        if (A[n-1] > 0) {
            if (A[0] * A[1] > A[n - 1] * A[n - 2]) {
                result = A[0] * A[1] * A[n - 1];
            } else {
                if (A[0] * A[1] * A[n - 1] >= A[n - 1] * A[n - 2] * A[n - 3]){
                    result = A[0] * A[1] * A[n - 1];
                }else{
                    result = A[n - 1] * A[n - 2] * A[n - 3];
                }
            }
        }else{
            result = A[n - 1] * A[n - 2] * A[n - 3];
        }
        return (int)result;
    }

    public static void main(String[] args){
        int[] A = {-3, 1, 2, -2, 5, 6};
        int[] A1 = {2, 1, 5, 7, 3, 4};
        int[] A2 = {-5, -6, -4, -7, -10};
        int[] A3 = {4, 7, 3, 2, 1, -3, -5};
        MaxProductOfThree product = new MaxProductOfThree();
        System.out.println("A...");
        System.out.println(product.solution(A));
        System.out.println("A1...");
        System.out.println(product.solution(A1));
        System.out.println("A2...");
        System.out.println(product.solution(A2));
        System.out.println("A3...");
        System.out.println(product.solution(A3));
    }
}
