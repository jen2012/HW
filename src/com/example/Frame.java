package com.example;

import java.util.Scanner;

public class Frame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String word = scan.nextLine();
        int wordLen = word.length();

        System.out.println("Введите высоту рамки целым числом: ");
        int h = scan.nextInt(); //высота

        System.out.println("Введите ширину рамки целым числом: ");
        int w = scan.nextInt(); //ширина
        scan.close();

        if (wordLen > w - 2 || h < 3) {
            System.out.println("Ошибка");
        } else {
            for (int i = 0; i < w; i++) {    // верх рамки, горизонтальная линия
                System.out.print("*");
            }
            System.out.println();
            if (h % 2 != 0) {
                for (int i = 0; i < h / 2 - 1; i++) {  // верх рамки вертикальные линии, если h - нечетное
                    for (int j = 0; j < w; j++) {
                        if (j > 0 & j != w - 1) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
            } else {
                for (int i = 0; i < h / 2 - 2; i++) {  // верх рамки вертикальные линии, если h - четное
                    for (int j = 0; j < w; j++) {
                        if (j > 0 & j != w - 1) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
            }
            for (int i = 0; i < (w - wordLen) / 2; i++) { //строка с текстом
                if (i == 0) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.print(word);
            for (int i = (w - wordLen) / 2 + wordLen + 1; i <= w; i++) {
                if (i == w) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            for (int i = 0; i < h / 2 - 1; i++) {  // низ рамки вертикальные линии
                for (int j = 0; j < w; j++) {
                    if (j > 0 & j != w - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < w; i++) {    // низ рамки, горизонтальная линия
                System.out.print("*");
            }
        }
    }
}