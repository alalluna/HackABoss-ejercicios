package com.hackaboss.holaMundo.utils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MorseUtils {

  static String[] letters = {"A", "B", "C", "D", "E", "F",
                "G", "H", "I", "J", "K", "L",
                "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X",
                "Y", "Z", "1", "2", "3", "4",
                "5", "6", "7", "8", "9", "0"}; //"%20" Esto no te vale para nada
   static String[] morseValues = {".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-",
                ".....", "-....", "--...", "---..", "----.", "-----"};//" "

    // convierto el texto que llega del sufijo
    public static String[] stringToArray (String text){
        return text.toUpperCase().split("");
    }

    //para sustituir una letra por su morse
    public static String findMorseValue(String letter) {
        return IntStream.range(0, letters.length)
                .filter(index -> letters[index].equals(letter))
                .mapToObj(index -> morseValues[index])
                .findFirst()
                .orElse(" "); // espacio entre palabras
    }

    //mapeo las letras y elaboro un arreglo con todos los con su equivalente morse
    public static String[] lettersToMorse (String[]letters){
        return Arrays.stream(letters)
                .map(MorseUtils::findMorseValue) //  .map(letter -> MorseUtils.findMorseValue(letter))
                .toArray(String[]::new);
    }

    //para construir los codigos morse y establecer una nueva oracion
    public static String concatenateMorse(String[] morseValues) {
        StringBuilder result = new StringBuilder();
        int index = 0;

        while (index < morseValues.length) {
            result.append(morseValues[index]);

            // Si el valor es un espacio,hay que separar más las palabras
            if (morseValues[index].equals(" ")) {
                result.append("/");
            } else {
                // Si es una letra bastara con un espacio para que no se peguen los codigos
                result.append(" ");
            }
            index++;
        }
        return result.toString();
    }


    //el metodo que une los demas viene de controller
    public static String MorseConverter (String words){
        // texto en array de caracteres
        String[] letters = stringToArray(words);
        // letras a valores Morse
        String[] morseValues = lettersToMorse(letters);
        // Concatenar los valores finales
        return concatenateMorse(morseValues);
    }
}