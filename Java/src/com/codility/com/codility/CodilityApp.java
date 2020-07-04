package com.codility;

import com.sun.source.tree.NewArrayTree;

import java.sql.Timestamp;
import java.time.Instant;

public class CodilityApp {
    public static void main(String[] args){
        Timestamp ts = new Timestamp(10000);
        System.out.println("CountDiv...");
        int A =  0;
        int B = 0
                      ;
        int K = 11;
        CountDiv countDiv = new CountDiv();
        System.out.println(countDiv.solution(A, B, K));

        System.out.println("GenomicRangeQuery...");
        GenomicRangeQuery rangeQuery = new GenomicRangeQuery();
        String S = "CAGCCTA";
        String S1 = "GGGGGGGGGGGGGGGGGGGGGGGGGG";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] result = rangeQuery.solution(S, P, Q);
        System.out.println("Genomic Range Query:... ");
        for (int r:result) System.out.println(r);
        System.out.println("MinAvgTwoSlice...");
        MinAvgTwoSlice twoSlice = new MinAvgTwoSlice();
        int[] A2 = {4, 2, 2, 5, 1, 5, 8};
        int[] A3 = {5, 4, 3, 2, 1};
        int[] A4 = {1, 2, 3, 4, 5};
        int position = twoSlice.solution(A4);
        System.out.println("MinAvgSlice @: " + position);

        System.out.println("PassingCars...");

        int[] A5 = {0, 1, 0, 1, 1};
        int[] A6 = {0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1};
        int[] A7 = {1,1,1,1,1,1,1,1};
        int[] A8 = {1, 1, 1, 0, 1, 1, 1};
        int[] A9 = {1, 0, 1, 0, 1, 0, 1, 0, 1};
        long beg = System.nanoTime();
        PassingCars cars = new PassingCars();
        System.out.println("Pairs of Cars passing: " + cars.solution(A9));
        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("PassingCarsEFF...");
        beg = System.nanoTime();
        PassingCarsEff carsEff = new PassingCarsEff();
        System.out.println("Pairs of Cars passing: " + carsEff.solution(A9));
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("Distinct...");
        int[] Dd = {2, 1, 1, 2, 3, 1};
        int[] Dd1 = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            Dd1[i] = i % 99;
        }
        int[] Dd2 = new int[0];
        beg = System.nanoTime();
        Distinct distinct = new Distinct();
        System.out.println("Distinct : " + distinct.solution(Dd2));
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("MaxProductOfThree...");
        int[] Ee1 = {2, 1, 1, 2, 3, 1};
        int[] Ee2 = new int[10000];
        int[] Ee = {-3, 1, 2, -2, 5, 6};
        for (int i = 0; i < 10000; i++) {
            Ee2[i] = i % 6;
        }
        beg = System.nanoTime();
        MaxProductOfThree productOfThree = new MaxProductOfThree();
        System.out.println("MaxProductOfThree : " + productOfThree.solution(Ee));
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("MaxDoubleSlice...");
        int[] Ff1 = {2, 1, 1, 2, 3, 1};
        int[] Ff2 = new int[10000];
        int[] Ff = {-3, 1, 2, -2, 5, 6};
        int[] Ff3 = {3, 2, 6, -1, 4, 5, -1, 2};
        for (int i = 0; i < 10000; i++) {
            Ff2[i] = i % 6;
        }
        beg = System.nanoTime();
        MaxDoubleSliceSum doubleSliceSum = new MaxDoubleSliceSum();
        System.out.println("MaxDoubleSlice : " + doubleSliceSum.solution(Ff3));
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("MaxDoubleSliceMine...");
        beg = System.nanoTime();
        MaxSumDoubleSliceSumMine doubleSliceSumMine  = new MaxSumDoubleSliceSumMine();
        System.out.println("MaxDoubleSlice : " + doubleSliceSumMine.solution(Ff3));
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("MaxProfit...");
        int[] Mp ={23171, 21011, 21123, 21366, 21013, 21367};
        int[] Mp1 = {1110, 2000};
        int[] Mp2 = {0, 0, 0};
        beg = System.nanoTime();
        MaxProfit1 maxProfit = new MaxProfit1();
        System.out.println("MaxProfit : " + maxProfit.solution(Mp));
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("MaxSliceSum...");
        int[] Mss ={3, 2, -6, 4, 0};
        int[] Mss1 = {-2, -1, -4, -2, -2000};
        int[] Mss2 = {0, 0, 0};
        int[] Mss3 = {-2, -3, 4, -1, -2, 1, 5, -3};
        beg = System.nanoTime();
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        System.out.println("MaxSliceSum : " + maxSliceSum.solution(Mss3));
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("CountFactors...");

        beg = System.nanoTime();
        CountFactors countFactors = new CountFactors();
        System.out.println("countFactors : " + countFactors.solution(24));
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("Flags...");
        int[] Fa = { 1, 5, 3, 4, 3, 4,  1,  2, 3, 4, 6, 2};
        int[] Fa1 = { 1, 5, 3, 4, 3, 4,  1,  2, 3, 4, 6, 2, 4, 2, 5, 6, 1};
        int[] Fa2 = {0, 0, 0};
        beg = System.nanoTime();
        Flags flags = new Flags();
        System.out.println("Flags: " + flags.solution(Fa1));
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("MinPerimeterRectangle...");

        beg = System.nanoTime();
        MiniPerimeterRectangle perimeterRectangle = new MiniPerimeterRectangle();
        System.out.println("MinPerimeterRectangle : " + perimeterRectangle.solution(3));
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("TestTemp...");
        int[] Ta = { 1, 3, 6, 4, 1, 2};
        int[] Ta1 = { 1, 5, 3, 4, 3, 4,  1,  2, 3, 4, 6, 2, 4, 2, 5, 6, 1};
        int[] Ta2 = {0, 0, 0};
        int[] Ta3 = {1, 2, 3};
        int[] Ta4 = {-1, -2};
        beg = System.nanoTime();
        TestTemp testTemp = new TestTemp();
        System.out.println("TestTemp: " + testTemp.solution(Ta4));
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("Test...");
        int[] T = { 1, -2, -3, 5};
        int[] T1 = { 1, 2, -3, 5};
        int[] T2 = {1, 2, 0, -5};
        int[] T3 = {1};
        int[] T4 = {-1};
        int[] T5 = {0};
        beg = System.nanoTime();
        Test test = new Test();
        System.out.println("Test: " + test.solution(T5));
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));

        System.out.println("Indeed...");
        int[] I1 = {1, 2, 3};
        int[] I2 = {4, 5, 6, 7};
        beg = System.nanoTime();
        Indeed indeed = new Indeed();
        int[] Ir = indeed.solution(I1, I2);
        for (int r:Ir) {
            System.out.println("r: " + r);
        }
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - beg));
    }
}
