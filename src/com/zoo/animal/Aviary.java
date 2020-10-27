package com.zoo.animal;

import com.zoo.exception.FindWordException;

public class Aviary {

    String[] aviary = new String[5];
    int lengthArr = 0;

    public void add(String word) {   // добавление в вольер
        try {
            aviary[lengthArr] = word;
            lengthArr++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вольер заполнен!");
        }
    }

    public void findWord(String word) throws FindWordException {   //поиск в вольере
        for (int i = 0; i < lengthArr; i++) {
            if (aviary[i].equals(word)) {
                throw new FindWordException("Такой элемент уже есть");
            }
        }
    }

    public void remove(int index) {
        for (int i = index; i < lengthArr - 1; i++) {             //удаление из вольера по индексу
            aviary[i] = aviary[i + 1];
        }
        lengthArr--;
    }

    public void remove(String word) {
        int index = 0;
        for (int i = 0; i < lengthArr; i++) {          // удаление из вольера по слову
            if (aviary[i].equals(word)) {
                index = i;
                break;
            }
        }
        remove(index);
    }

    public String get(int index) {
        return aviary[index];
    }

    public int getLengthArr() {
        return lengthArr;
    }
}
//