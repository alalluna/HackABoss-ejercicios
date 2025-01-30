package com.hackaboss.holaMundo.utils;

public class RomanUtils {
    public static String ValidateNumber(int num){
        final int MAX = 1000;
        final int MIN = 1;

        if (num < MIN || num > MAX){
            return "El numero debe estar entre "+ MIN + " y "+ MAX + ".";
        }
        String romanNum = RomanConverterNumbars(num);
        return romanNum;
    }
    public static String RomanConverterNumbars(int num){

        int[]values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[]romanValues ={"M", "CM", "D","CD","C","XC", "L","XL", "X","IX", "V", "IV", "I"};


        StringBuilder result = new StringBuilder();
        int index = 0;
        while(num > 0){
            if(num >=values[index]){
                result.append(romanValues[index]);
                num -=values[index];
            }else{
                index++;
            }
        }
        return result.toString();
    }
}
