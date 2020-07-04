package com.codility;

import java.util.HashMap;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[]Q){

        HashMap<Character, Integer>table = new HashMap<>();
        table.put('A', 1);
        table.put('C', 2);
        table.put('G', 3);
        table.put('T', 4);

        char[] S_char = S.toCharArray();
        int lenS = S_char.length;
        int M = P.length;
        int[] result = new int[M];

        for (int i = 0; i < M; i++){
            result[i] = 4;
            for (int j = P[i]; j <= Q[i]; j++){
                if (table.get(S_char[j]) < result[i]){
                    result[i] = table.get(S_char[j]);
                }
            }
        }
        return result;
    }
}
