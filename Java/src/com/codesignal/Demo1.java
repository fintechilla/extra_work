package com.codesignal;

public class Demo1 {
    public Demo1() {
    }
    public int addTwoDiggits(int n){
        int tens = (int) Math.floor(n/10);
        int units = n - tens*10;
        return tens + units;

    }
}
