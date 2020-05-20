package com.codility;

import java.util.HashMap;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[]Q){

        HashMap<String, Integer>table = new HashMap<>();
        table.put("A", 1);
        table.put(String.valueOf('C'), 2);
        table.put(String.valueOf('G'), 3);
        table.put(String.valueOf('T'), 4);

//        char[] S_char = S.toCharArray();
































        int lenS = S.length();
        int M = P.length;
        int[] result = new int[M];

        for (int k = 0; k < M ; k++) {
            int beg = P[k] ;
            int end = Q[k] ;
            int minImpactFactor = 0;
            String letter0 = S.substring(beg, beg + 1);
//            String letter1 = S.substring(beg + 1, beg + 2);
            for (int i = beg; i <= end; i++) {
                String letter = S.substring(i, i + 1);
                if (letter0 == letter){
                    result[k] = result[k-1];
                } else {
                    int impFactor = table.get(letter);
                    if (i == beg) {
                        minImpactFactor = impFactor;

                    } else {
                        minImpactFactor = Math.min(impFactor, minImpactFactor);
                    }
                }
                letter0 = letter;
            }
            result[k] = minImpactFactor;
        }
        return result;
    }
}
