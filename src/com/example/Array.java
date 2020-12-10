package com.example;

public class Array {
    public static void main(String[] args) {
        int[] firstArr = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] reverseArr = new int[firstArr.length];

        reverseArray(firstArr, reverseArr);
        for (int i : reverseArr) {
            System.out.print(i + " ");
        }
    }

    public static void reverseArray(int[] firstArr, int[] reverseArr) {
        for (int i = firstArr.length - 1; i > 0; ) {
            for (int j = 0; j < firstArr.length; j++) {
                reverseArr[j] = firstArr[i];
                i--;
            }
        }
    }
}

