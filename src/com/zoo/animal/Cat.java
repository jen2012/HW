package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.HowManyEatException;

public class Cat extends Animal implements Moveable {

    String name;
    int age;
    String say;
    String eat;
    int a;
    String walk;
    boolean jump;

    public Cat() {
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
        if (a < 2 || a > 10) {
            throw new HowManyEatException("Кота надо кормить от 2 до 10 раз в день!");
        } else
            System.out.println("Ест " + a + " раз(а) в день");
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
    public void walk(String walk) {
        System.out.println("Перемещается: " + walk);
    }

    @Override
    public void jump(boolean jump) {
        System.out.print("Умеет прыгать: ");
        if (jump == true) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }
}



