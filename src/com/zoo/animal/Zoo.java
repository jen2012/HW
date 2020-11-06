package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.AviaryNotExistException;
import com.zoo.exception.FindWordException;
import com.zoo.exception.HowManyEatException;

import java.util.HashMap;
import java.util.Map;

public class Zoo {

    public static void main(String[] args) throws HowManyEatException, AgeException, FindWordException, AviaryNotExistException {

        System.out.println("Добавляем животных в 1 вольер\n");

        Aviary aviary = new Aviary();
        aviary.add("Кот");
        aviary.add("Собака");
        aviary.add("Канарейка");
        aviary.add("Хомяк");
        aviary.add("Черепаха");

        try {
            aviary.findWord("Черепаха");
        } catch (FindWordException e) {
            System.out.println(e.getMessage());
        }

        aviary.remove(2);
        aviary.remove("Кот");

        for (int i = 0; i < aviary.getLengthArr(); i++) {
            System.out.println(aviary.get(i));
        }

        System.out.println("\nДобавляем животных в разные вольеры\n");

        Map<String, AviaryCollect> anymalsInAviarys = new HashMap<>();
        try {
            anymalsInAviarys.put("Кот", new AviaryCollect("вольер 1"));
            anymalsInAviarys.put("Собака", new AviaryCollect("вольер 2"));
            anymalsInAviarys.put("Канарейка", new AviaryCollect("вольер 3"));
            anymalsInAviarys.put("Хомяк", new AviaryCollect("вольер 1"));
            anymalsInAviarys.put("Черепаха", new AviaryCollect("вольер 4"));
        } catch (AviaryNotExistException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("КОТ");
        Cat cat1 = new Cat();
        cat1.name("Мурзик");
        cat1.say("мяукает");
        try {
            cat1.age(-1);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        cat1.eat("вискас");
        try {
            cat1.eat(1);
        } catch (
                HowManyEatException e) {
            System.out.println(e.getMessage());
        }
        cat1.walk("на 4 лапах");
        cat1.jump(true);

        System.out.println();

        System.out.println("СОБАКА");
        Dog dog1 = new Dog();
        dog1.name("Шарик");
        dog1.say("лает");
        try {
            dog1.age(8);
        } catch (
                AgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            dog1.eat(5);
        } catch (
                HowManyEatException e) {
            System.out.println(e.getMessage());
        }
        dog1.eat("мясо");
        dog1.hunt(false);
        dog1.bite(true);

        System.out.println();

        System.out.println("КАНАРЕЙКА");
        Bird bird1 = new Bird();
        bird1.name("Чижик");
        bird1.say("чирикает");
        try {
            bird1.age(-2);
        } catch (
                AgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            bird1.eat(10);
        } catch (
                HowManyEatException e) {
            System.out.println(e.getMessage());
        }
        bird1.eat("пшено");
        bird1.fly(false);
        bird1.flapsWings(true);

        System.out.println();

        System.out.println("ХОМЯК");
        Hamster hamster1 = new Hamster();
        hamster1.name("Афоня");
        hamster1.say("пищит");
        try {
            hamster1.age(3);
        } catch (
                AgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            hamster1.eat(5);
        } catch (
                HowManyEatException e) {
            System.out.println(e.getMessage());
        }
        hamster1.eat("орехи");
        hamster1.live("в норке");
        hamster1.lifestyle(false);

        System.out.println();

        System.out.println("ЧЕРЕПАХА");
        Turtle turtle1 = new Turtle();
        turtle1.name("Буся");
        turtle1.say("молчит");
        try {
            turtle1.age(100);
        } catch (
                AgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            turtle1.eat(1);
        } catch (
                HowManyEatException e) {
            System.out.println(e.getMessage());
        }
        turtle1.eat("траву");
        turtle1.crawl(true);
        turtle1.speedCrawl(1.5);
    }

}


