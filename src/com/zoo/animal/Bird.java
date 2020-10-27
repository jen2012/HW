package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.HowManyEatException;

public class Bird extends Animal implements FlyAble {

    String name;
    int age;
    String say;
    String eat;
    int a;
    boolean fly;
    boolean flapsWings;

    public Bird() {
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
        if (a <= 0) {
            throw new HowManyEatException("Кормушка пустая!");
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
    public void fly(boolean fly) {
        System.out.print("Может летать: ");
        if (fly == true) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }

    @Override
    public void flapsWings(boolean flapsWings) {
        System.out.print("Машет крыльями: ");
        if (flapsWings == true) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }
}
