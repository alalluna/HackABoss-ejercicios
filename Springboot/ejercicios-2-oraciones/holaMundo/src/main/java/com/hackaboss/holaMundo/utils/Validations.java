package com.hackaboss.holaMundo.utils;

import java.util.List;

public class Validations {
    public static <T> void validateList(List<T> listado){
        if (listado == null || listado.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacía");
        }
    }
}
