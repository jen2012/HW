package com.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Numsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();

        List<Integer> seq = new ArrayList<>(); // заполняем список цифрами в обратном порядке
        while (num > 0) {
            seq.add(num % 10);
            num /= 10;
        }

        ListIterator<Integer> nums = seq.listIterator();
        System.out.print("Обратный порядок цифр введенного числа: ");
        while (nums.hasNext()) {
            System.out.print(nums.next() + " ");
        }
        System.out.print("\nПрямой порядок цифр введенного числа: ");
        while (nums.hasPrevious()) {
            System.out.print(nums.previous() + " ");
        }

    }

}