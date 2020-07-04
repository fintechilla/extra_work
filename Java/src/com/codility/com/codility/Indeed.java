package com.codility;

import java.sql.SQLOutput;

public class Indeed {
    public int[] solution(int[] a, int[] b){

    int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[2*i] = a[i];
            result[2*i + 1] = b[i];
        }

        return result;
    }
}
