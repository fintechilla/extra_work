package com.codility;

public class SplitDigits {
    int number;
    final int MAX = 10;

    public SplitDigits(int number) {
        this.number = number;
    }

    public int[] calcNums(){
        int power = 0;

        for (int i = MAX; i >= 0; i--) {
            int num = (int) Math.pow(10, i);
            if (number - num >= 0){
                power = i;
                break;
            }
        }
        System.out.println("power: " + power);

        int[] result = new int[power + 1];
        for (int j = power; j >= 0; j--) {
            int numTemp= (int) Math.floor(number / Math.pow(10,j));
            result[power - j] = numTemp;
            number = (int) (number - (int) numTemp * Math.pow(10,j));
        }
        return result;
    }

    public static void main(String[] args){
        SplitDigits digits = new SplitDigits(3250);
        int[] res = digits.calcNums();
        System.out.println("res: ");
        for(int k: res) System.out.println(k);
    }
}
