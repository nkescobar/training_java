package com.training.variables;

public class EjemploStringInmutabilidad {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Nasly Escobar";
      
        String resultado = curso.concat(" ").concat(profesor);

        System.out.println("resultado = " + resultado);
        String resultado2 =  curso.transform(c -> {
               return c + " con " + profesor;
           });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);
    }
}
