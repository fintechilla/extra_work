package com.codility;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        int result = 0;
        double minAvg = 0;
        int minP = 0;
        int N = A.length;

        for (int p = 0; p < N - 1; p++) {
            for (int q = p + 1; q < N; q++) {
                double tempAvg = getAvg(A, p, q);
                if (p==0 && q==1){
                    minAvg = tempAvg;
                    minP = p;
                }
                else {
                    if (minAvg > tempAvg){
                        minAvg = tempAvg;
                        minP = p;
                    }
                }
            }
        }
        return minP;
    }

    public double getAvg(int[] A, int p, int q) {
        double result = 0;
        for (int i = p; i <= q; i++) {
            result += A[i];
        }
        result = result / (q - p + 1);
        return result;
    }


}
