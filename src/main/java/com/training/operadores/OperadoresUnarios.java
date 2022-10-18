package com.training.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;
        int j = +i; // j = ()*i => 5

        System.out.println("j = " + j);
        // preincremento
        i = 1;
        j = ++i;

        System.out.println("valor = " + i);
        System.out.println("valor2 = " + j);
        // post incremento
        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // pre decremento

        i = 3;
        j = --i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // post decremento

        i = 4;
        j = i--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
