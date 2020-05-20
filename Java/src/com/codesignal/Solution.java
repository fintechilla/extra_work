package com.codesignal;

import java.io.*;
import java.util.*;

class Solution
{
    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int t = 0; t < n; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = sc.next();
            System.out.println(a+b);
            System.out.println("s: " + s);
        }
    }
}