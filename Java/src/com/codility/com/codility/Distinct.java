package com.codility;

import java.util.*;

public class Distinct {
    public int solution(int[] A){
        long result = 0;
        int lenA = A.length;
//        Map<Integer, Integer> distinct = new HashMap();

        for (int i = 0; i < lenA - 1; i++) {
            int L0 = i - A[i];
            int H0 = i + A[i];
            for (int j = i + 1; j < lenA; j++) {
                int L1 = j - A[j];
                int H1 = j + A[j];
                if ((L0 <= L1 && H0 >= L1) || (H0 >= L1 && H0 <= H1)){
//                    distinct.put(A[i], A[j]);
//                    System.out.format("\n%d  %d :  %d %d", i,  j, A[i], A[j]);
                    result ++;
                }
            }
//            System.out.println("\n");
        }
//        distinct.forEach((key, value) -> {
//            System.out.println("Key: " + key + " Value: " + value);
//        });
        return (int) result;
    }

    public static void main(String[] args){
        int[] A = {1, 5, 2, 1, 4, 0};
        Distinct distinct = new Distinct();
        System.out.println(distinct.solution(A));
    }
}
