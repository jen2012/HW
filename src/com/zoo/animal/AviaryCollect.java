package com.zoo.animal;

import com.zoo.exception.AviaryNotExistException;

public class AviaryCollect {

    public AviaryCollect(String str) throws AviaryNotExistException {
        if (!(str.equals("вольер 1") || str.equals("вольер 2") || str.equals("вольер 3"))) {
            throw new AviaryNotExistException("Вольера \"" + str + "\" не существует");
        }
        else {
        System.out.println("Животное помещено в " + str);
       }
    }
}






