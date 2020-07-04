package com.codility;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Triangle {
    public int solution(int[] A){

        int lenA = A.length;
        if (lenA < 3){
            return 0;
        }
        ArrayList <BigInteger> AL = new ArrayList<>();
        for (int m = 0; m < lenA; m++) {
            AL.add(BigInteger.valueOf(A[m]));
        }
        for (BigInteger bi : AL){
            System.out.println(bi);
        }
        for (int n = 0; n < AL.size(); n++) {
            System.out.println(AL.get(n));
        }

        BigInteger bigInteger = new BigInteger("0");
        for (int i = 0; i < lenA -2; i++) {
            for (int j = i + 1; j < lenA - 1; j++) {
                for (int k = j + 1; k < lenA; k++) {
                    System.out.println(AL.get(i) + " " + AL.get(j) + " " + AL.get(k));
                    System.out.println((AL.get(i).add(AL.get(j))).compareTo(AL.get(k))==1);
                    System.out.println((AL.get(i).add(AL.get(k))).compareTo(AL.get(j))==1);
                    System.out.println(AL.get(j).add(AL.get(k)).compareTo(AL.get(i))==1);

                    if (((AL.get(i).add(AL.get(j))).compareTo(AL.get(k))==1)
                        && ((AL.get(i).add(AL.get(k))).compareTo(AL.get(j))==1)
                            && ((AL.get(j).add(AL.get(k))).compareTo(AL.get(i))==1) ){
                        System.out.println("Return 1");
                        return 1;
                    }
                }

            }
        }
//        Arrays.sort(A);
//        for (int i = 0; i < lenA - 2; i++) {
//            if (A[i] + A[+1] > A[i+2]){
//                result = 1;
//            }
//        }
        return 0;
    }

    public static void main(String[] args){
        int[] A = {10, 2, 5, 1, 8, 20};
        int[] A1 = {10, 50, 5, 1};
        Triangle triangle = new Triangle();
        System.out.println("Solution: " + triangle.solution(A1));


        }

}
