package com.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Math.sqrt;

public class Numcomparator implements Comparator<Numcomparator> {
    int num;
    int divPrime;

    public Numcomparator(int num, int divPrime) {
        this.num = num;
        this.divPrime = divPrime;
    }

    public Numcomparator() {
    }

    @Override
    public int compare(Numcomparator o, Numcomparator t1) {
        return o.divPrime - t1.divPrime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("Число = ").append(num);
        sb.append(" Простых делителей = ").append(divPrime);
        return sb.toString();
    }

    private static int getDivPrime(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;
                while (num % i == 0) {
                    num /= i;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        List<Numcomparator> numbers = new ArrayList<>();

        Numcomparator a = new Numcomparator(67477, getDivPrime(67477));
        Numcomparator b = new Numcomparator(754, getDivPrime(754));
        Numcomparator c = new Numcomparator(24, getDivPrime(24));
        Numcomparator d = new Numcomparator(101, getDivPrime(101));
        Numcomparator e = new Numcomparator(38589, getDivPrime(38589));

        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        numbers.add(e);


        System.out.println("До сортировки: ");
        for (Numcomparator numb : numbers) {
            System.out.println(numb);
        }

        numbers.sort(new Numcomparator());

        System.out.println("После сортировки: ");
        for (Numcomparator numb : numbers) {
            System.out.println(numb);
        }
    }
}
