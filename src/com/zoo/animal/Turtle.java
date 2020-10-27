package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.HowManyEatException;

public class Turtle extends Animal implements CrawlAble {

    String name;
    int age;
    String say;
    String eat;
    int a;
    boolean crawl;
    double speed;

    public Turtle() {
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
        if (a < 1 || a > 3) {
            throw new HowManyEatException("Кормите черепху 1-3 раза в день!");
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
    public void crawl(boolean crawl) {
        System.out.print("Может ползать: ");
        if (crawl == true) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    @Override
    public void speedCrawl(double speed) {
        System.out.println("Перемещается со скоростью: " + speed + " м/мин");
    }
}
