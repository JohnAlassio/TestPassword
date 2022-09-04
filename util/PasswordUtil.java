package com.platzi.javatests.util;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }
//ay tres valores a evaluar, si el password es debil, medio o fuerte.

    public static SecurityLevel assessPassword(String password) {
//si un password tiene menos de 8 letras es weak, debil
        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }
//esto es un rango de letras en minusculas y en mayusculas, y con el + indicamos que puede mas de una ves
       if (password.matches("[a-zA-Z]+")) {
            return SecurityLevel.WEAK;
        }
//esto es en caso de que tenga numeros y letras, sera medium,
        if (password.matches("[a-zA-Z0-9]+")) {
            return SecurityLevel.MEDIUM;
        }
//Si el password tiene Letras Numeros y signos, el password sera fuerte, strong!
        return SecurityLevel.STRONG;
    }
}
