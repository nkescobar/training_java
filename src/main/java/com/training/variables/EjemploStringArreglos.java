package com.training.variables;

public class EjemploStringArreglos {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();
        for (char caracter: arreglo
             ) {
            System.out.println("caracter = " + caracter);
        }
    }
}
