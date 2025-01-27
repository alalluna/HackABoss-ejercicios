package com.hackaboss.holaMundo.utils;

import java.util.List;
import java.util.Random;

public class GenerateNumberRandom {
    public static <T> T returnRandomNumber(List<T> listado) {
        if (listado == null || listado.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacía");
        }
        Random random = new Random();
        int index = random.nextInt(listado.size());
        return listado.get(index);
    }
}
