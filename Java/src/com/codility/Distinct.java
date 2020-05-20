package com.codility;

import java.util.*;

public class Distinct {
    public int solution(int[] A){
        int result = 0;
        int lenA = A.length;
        Set<Integer> distinct = new HashSet<>();

        for (int i = 0; i < lenA; i++) {
            distinct.add(A[i]);
            }
        return distinct.size();
    }
}
