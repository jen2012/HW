package com.zoo.animal;

import com.zoo.exception.AgeException;
import com.zoo.exception.HowManyEatException;

public abstract class Animal {

    public abstract void name(String name);

    public abstract void say(String say);

    public abstract void eat(String eat);

    public abstract void eat(int a) throws HowManyEatException;

    public abstract void age(int age) throws AgeException;


}



