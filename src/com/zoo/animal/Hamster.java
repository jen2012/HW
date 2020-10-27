package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.HowManyEatException;

public class Hamster extends Animal implements LiveAble {

    String name;
    int age;
    String say;
    String eat;
    int a;
    String live;
    boolean lifestyle;

    public Hamster() {
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
            throw new HowManyEatException("Не забывайте кормить животное!");
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

    public void live() {
        System.out.println("живет в норке");
    }

    public void lifestyle() {
        System.out.println("образ жизни - ночной");
    }

    @Override
    public void live(String live) {
        System.out.println("Где живет: " + live);
    }


    @Override
    public void lifestyle(boolean lifestyle) {
        System.out.print("Образ жизни: ");
        if (lifestyle == true) {
            System.out.println("дневной");
        } else {
            System.out.println("ночной");
        }

    }

}
