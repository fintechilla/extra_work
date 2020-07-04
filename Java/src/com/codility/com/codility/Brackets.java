package com.codility;

import java.util.*;

public class Brackets {
    public int solution(String S) {
        int lenS = S.length();
        if (lenS == 0) {
            return 1;
        } else if (lenS % 2 == 1) {
            return 0;
        }

        Map<String, String> begChars = new HashMap<>();
        begChars.put("(", ")");
        begChars.put("{", "}");
        begChars.put("[", "]");

        Map<String, String> endChars = new HashMap<>();
        endChars.put(")", "(");
        endChars.put("}", "{");
        endChars.put("]", "[");

        ArrayDeque<String> listBrackets = new ArrayDeque<>();
        String sStr0 = String.valueOf(S.charAt(0));
        if (begChars.containsKey(sStr0)) {
            listBrackets.push(sStr0);
        } else {
            return 0;
        }
        boolean endCharAtLeast1 = false;
        for (int i = 1; i < lenS; i++) {
            String sStr = String.valueOf(S.charAt(i));
            if (begChars.containsKey(sStr)) {
                listBrackets.push(sStr);
            } else {
                if (listBrackets.size() > 0) {
                    if (listBrackets.peek().equals(endChars.get(sStr))) {
                        listBrackets.pop();
                        endCharAtLeast1 = true;
                    } else {
                        return 0;
                    }
                }else{
                    return 0;
                }
            }
        }
        if (endCharAtLeast1  && listBrackets.size() == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        String S = "{[()()]}";
        String S1 = "([)()]";
        String S2 = "(){}[]()()()";
        String S3 = "{{{{";
        String S4 = "())(()";
        String S5 = "()(()()(((()())(()()))";
        Brackets brackets = new Brackets();
        System.out.println(String.format("S %s result is %d", S, brackets.solution(S)));
        System.out.println(String.format("S1 %s result is %d", S1, brackets.solution(S1)));
        System.out.println(String.format("S2 %s result is %d", S2, brackets.solution(S2)));
        System.out.println(String.format("S3 %s result is %d", S3, brackets.solution(S3)));
        System.out.println(String.format("S4 %s result is %d", S4, brackets.solution(S4)));
        System.out.println(String.format("S5 %s result is %d", S5, brackets.solution(S5)));
    }
}

