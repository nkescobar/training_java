package com.training.variables;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter "+ caracter );
        System.out.println("decimal = " + decimal);
        System.out.println("(decimal == caracter) = " + (decimal == caracter));
        
        char simbolo = '@';

        char espacio ='\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';


        System.out.println("simbolo = " + simbolo);
        System.out.println("(simbolo == caracter) = " + (simbolo == caracter));
        System.out.println("Tipo CHAR corresponde en byte a  --> " + tabulador+ tabulador + Character.BYTES);
        System.out.println("Tipo CHAR corresponde en bites a  --> " + Character.SIZE);
        System.out.println("Valor maximo de un CHAR  --> " + Character.MAX_VALUE);
        System.out.println("Valor minimo de un CHAR  --> " + Character.MIN_VALUE);

        System.out.println();
    }
}
