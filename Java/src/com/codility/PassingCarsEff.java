package com.codility;

public class PassingCarsEff {
    public int solution(int[] A) {
        int N = A.length;
        int result = 0;
        int fstCars = 0;
        int loop = 0;
        boolean fstLoop = true;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0 && loop == 0 && fstLoop){
                loop = i;
                fstLoop = false;
            }
             if(A[i] == 1 && !fstLoop) {
                 fstCars++;
             }
        }
        if(fstLoop){
            return 0;
        }
        result = fstCars;
        for (int i = loop + 1; i < N; i++) {

            if (A[i] == 0) {
                result += fstCars;
            }
            else { fstCars--;
            }
        }
        return result;
    }
}
