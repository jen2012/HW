package com.Collections;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите исходное слово на русском языке: ");
        String originWord = scan.next();

        System.out.println("Исходное слово: " + originWord);

        Set<Character> originLetters = new HashSet<>();    //получаем множество букв из исходного слова
        for (int i = 0; i < originWord.length(); i++) {
            originLetters.add(originWord.charAt(i));
        }

        System.out.println("Введите слово из букв: " + originLetters);
        String inWord = scan.next();

        Set<Character> inWordLetters = new HashSet<>();  // получаем множество букв из составленного слова
        for (int i = 0; i < inWord.length(); i++) {
            inWordLetters.add(inWord.charAt(i));
        }

        Set<String> history = new HashSet<>(); // множество для хранения слов

        Map<Character, Integer> point = new HashMap<>(); // баллы за буквы
        point.put('а', 1);
        point.put('б', 1);
        point.put('в', 1);
        point.put('г', 1);
        point.put('д', 1);
        point.put('е', 1);
        point.put('ё', 3);
        point.put('ж', 3);
        point.put('з', 5);
        point.put('и', 1);
        point.put('й', 3);
        point.put('к', 1);
        point.put('л', 1);
        point.put('м', 1);
        point.put('н', 1);
        point.put('о', 1);
        point.put('п', 2);
        point.put('р', 2);
        point.put('с', 2);
        point.put('т', 2);
        point.put('у', 3);
        point.put('ф', 5);
        point.put('х', 5);
        point.put('ц', 5);
        point.put('ч', 5);
        point.put('ш', 5);
        point.put('щ', 5);
        point.put('ъ', 5);
        point.put('ы', 3);
        point.put('ь', 3);
        point.put('э', 5);
        point.put('ю', 5);
        point.put('я', 1);
        int sum = 0;

        while (true) {
            if (inWord.isBlank()) {
                System.out.println("Введено пустое слово, игра окончена.");
                break;
            } else if (!originLetters.containsAll(inWordLetters)) {
                System.out.println("Слово состоит не из букв исходного слова.");
            } else if (!history.contains(inWord) && originLetters.containsAll(inWordLetters)) {
                history.add(inWord);
                System.out.println("Введено слово: " + inWord);
                for (int i = 0; i < inWord.length(); i++) {
                    System.out.println("буква " + inWord.charAt(i) + " дает " + point.get(inWord.charAt(i)) + " балла(ов)");
                    sum = sum + point.get(inWord.charAt(i));
                }
                System.out.println("Сумма баллов = " + sum);
            } else {
                System.out.println("Это слово уже использовано.");
            }
            System.out.println("Введите новое слово: ");
            inWord = scan.nextLine();
        }

    }

}