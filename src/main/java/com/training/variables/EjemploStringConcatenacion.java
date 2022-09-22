package com.training.variables;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Nasly Escobar";
        String detalle = curso + " con la instructora " + profesor;
        System.out.println("detalle = " + detalle);
        int numeroA = 20;
        int numeroB = 5;

        System.out.println(detalle +" " +( numeroA + numeroB));
        System.out.println(  numeroA + numeroB +" " +detalle );

        String detalle2 = curso.concat(" ")
                .concat("con ")
                .concat(profesor);

        System.out.println("detalle2 = " + detalle2);
        

    }
}
