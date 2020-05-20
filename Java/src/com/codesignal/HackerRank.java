package com.codesignal;

import java.util.ArrayList;
import java.util.List;

public class HackerRank {
    public HackerRank() {
    }
    public List<Integer> solution(int l, int r){
        List<Integer> result = new ArrayList<>();
        if (l%2==0){
            l = l +1;
        }
        for (int i = l; i < r; i+=2) {
            result.add(i);
        }
        return result;
    }
}
