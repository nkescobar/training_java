package com.training.variables;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación java");
        String curso3 = "Programación Java";

        boolean esIgual = curso == curso2;
        System.out.println("esIgual el objeto = " + esIgual);
        esIgual = curso.equals(curso2);
        System.out.println("esIgual el valor  = " + esIgual);
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual  ignorando mayusculas y minusculas = " + esIgual);
        esIgual = curso == curso3;
        System.out.println("esIgual el objeto curso 3 = " + esIgual);
        

    }
}
