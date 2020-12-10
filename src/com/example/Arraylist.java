package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scan.next();

        ArrayList<Character> chrs = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chrs.add(str.charAt(i));             // преобразуем строку в список chrs
        }
        removeDuplicates(chrs);
    }

    public static void removeDuplicates(ArrayList<Character> chrs) {    //ищем и удляем дубликаты символов
        for (int i = 0; i < chrs.size(); i++) {
            for (int j = i + 1; j < chrs.size(); j++) {
                if (chrs.get(i) == chrs.get(j)) {
                    chrs.remove(j);
                    j--;
                }
            }
        }
        System.out.println(chrs);
    }
}