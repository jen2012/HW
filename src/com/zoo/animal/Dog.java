package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.HowManyEatException;

public class Dog extends Animal implements HuntAble {

    String name;
    int age;
    String say;
    String eat;
    int a;
    boolean hunt;
    boolean bite;

    public Dog() {
    }

    @Override
    public void name(String name) {
        System.out.println("Имя: " + name);
    }

    @Override
    public void say(String say) {
        System.out.println("Голос: " + say);
    }

    @Override
    public void eat(String eat) {
        System.out.println("Что ест: " + eat);
    }

    @Override
    public void eat(int a) throws HowManyEatException {
        if (a < 2 || a > 5) {
            throw new HowManyEatException("Собака должна питаться от 2 до 5 раз в день!");
        } else {
            System.out.println("Ест " + a + " раз(а) в день");
        }
    }

    @Override
    public void age(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("Возраст не может быть отрицательным числом!");
        } else {
            System.out.println("Возраст: " + age + " года (лет)");
        }
    }

    @Override
    public void hunt(boolean hunt) {
        System.out.print("Гоняет кошек: ");
        if (hunt == true) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }

    @Override
    public void bite(boolean bite) {
        System.out.print("Может укусить: ");
        if (bite == true) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }
}
