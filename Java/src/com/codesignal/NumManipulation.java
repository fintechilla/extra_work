package com.codesignal;

public class NumManipulation {
    public NumManipulation() {
    }
    public int solution(int n) {
        int mP = 0;
        System.out.println("Hello");
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);

            int res = (int) Math.floor(n / Math.pow(10,i));
            System.out.println("power: " + i + " res: " + res);
            if (Math.floor(n / Math.pow(10, i)) < 1) {
                mP = i - 1;
                System.out.println("Order: " + mP);
            }
        }

        int[] nums = new int[mP];
        for (int j = mP; j <= 0; j--) {
            int tempDigit = (int) (n / Math.pow(10, j));
            if (tempDigit < 1) {
                nums[j] = (int) Math.floor(n / tempDigit);
            }
        }
        return mP;
    }
}
