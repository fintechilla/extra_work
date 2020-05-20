package com.tutorialspoint;

import java.sql.Array;

public class Insertion {
    public Insertion() {
    }
    public int[] solution(int[] LA, int item, int k){
        int n = LA.length;
        int i = 0, j = n;
        int[] result = new int[n+1];

        System.out.println("The original array elements are :\n");

        for(i = 0; i<n; i++) {
            System.out.format("LA[%d] = %d \n", i, LA[i]);
        }

        n = n + 1;

        while( j >= k) {
            LA[j+1] = LA[j];
            j = j - 1;
        }

        LA[k] = item;

        System.out.println("The array elements after insertion :\n");

        for(i = 0; i<n; i++) {
            System.out.format("LA[%d] = %d \n", i, LA[i]);
        }
        return LA;
    }
}
