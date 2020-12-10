package com.example;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scan.nextLine();

        isPalindr(word);
        if (isPalindr(word)) {
            System.out.println(word + " - палиндром");
        } else {
            System.out.println(word + " - не палиндром");
        }
    }

    public static boolean isPalindr(String word) {
        if (word.length() <= 1) {            //выход, если остался 1 или 0 символов
            return true;
        }
        if (word.charAt(0) != word.charAt(word.length() - 1)) { //выход, если первый и последний символ не совпадают
            return false;
        }
        return isPalindr(word.substring(1, word.length() - 1)); //отбрасывем 1 и последний символы и начинаем сначала
    }
}





