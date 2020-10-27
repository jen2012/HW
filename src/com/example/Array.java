package com.example;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] FirstArr = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] ReverseArr = new int[FirstArr.length];

        ReverseArray(FirstArr, ReverseArr);
        for (int i : ReverseArr) {
            System.out.print(i + " ");
        }
    }

    public static void ReverseArray(int[] FirstArr, int[] ReverseArr) {
        for (int i = FirstArr.length - 1; i > 0; ) {
            for (int j = 0; j < FirstArr.length; j++) {
                ReverseArr[j] = FirstArr[i];
                i--;
            }
        }
    }
}

