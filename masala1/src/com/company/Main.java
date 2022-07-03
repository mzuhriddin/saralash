package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] arr = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };

        center(arr);
    }

    public static void center(int[][] arr) {
        int gor = 0, ver = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                if (arr[i][i1] == 1) {
                    gor = i1;
                    ver = i;
                    break;
                }
            }
        }
        int step = Math.abs(3 - gor) + Math.abs(3 - ver);
        System.out.println(step);
    }
}
