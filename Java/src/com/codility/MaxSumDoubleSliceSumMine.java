package com.codility;

public class MaxSumDoubleSliceSumMine {
    public int solution(int[] A) {
        int result = 0;
        int N = A.length;

        result = getSum(A, 0, 1, 2);

        for (int x = 0; x < N - 2; x++) {
            for (int y = x + 1; y < N -1; y++) {
                for (int z = y + 1; z < N - 1; z++) {
                    int tempSum = getSum(A, x, y, z);
                    if (tempSum > result){
                        result = tempSum;
                    }
                }

            }
        }
        return result;
    }

    public int getSum(int[] A, int X, int Y, int Z){
        int result = 0;

        for (int i = X + 1; i < Y; i++) {
            result += A[i];
        }
        for (int i = Y + 1; i < Z; i++) {
            result += A[i];
        }
        return result;
    }
}
