package com.codility;

public class MiniPerimeterRectangle {
    public int solution(int N){

        int maxB = (int) Math.ceil(Math.sqrt(N));
        int count = 0;
        int minP = 2* (N + 1);

        for (int i = 1; i <= maxB; i++) {

            if(N % i == 0){
                int b = N/i;
                count +=1;
                minP = Math.min(minP, 2*(b + i) );
            }
        }
        return minP;
    }
}
