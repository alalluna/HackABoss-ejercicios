package com.hackaboss.holaMundo.utils;

import java.util.List;
import java.util.Random;

public class RandomNumbers {
    public static <T> T returnRandomNumber(List<T> listado) {
        Validations.validateList(listado);
        Random random = new Random();
        int index = random.nextInt(listado.size());
        return listado.get(index);
    }

}
