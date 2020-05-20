package com.tutorialspoint;

public class TutorialsApp {
    public static void main(String[] args) {


        Insertion insertion = new Insertion();
        int[] LA = {1, 3, 5, 7, 8};
        int[] LA1 = insertion.solution(LA, 10, 3);

        for(int i=0; i < LA1.length; i++){
            System.out.println("i: " + i);
        }
    }
}
