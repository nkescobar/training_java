package com.training.variables;

public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 3;

        System.out.println("Numero byte  --> " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a  --> " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a  --> " + Byte.SIZE);
        System.out.println("Valor maximo de un byte  --> " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte  --> " + Byte.MIN_VALUE);

        System.out.println();
        short numeroShort = 32767;

        System.out.println("Numero short  --> " + numeroShort);
        System.out.println("Tipo short corresponde en byte a  --> " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a  --> " + Short.SIZE);
        System.out.println("Valor maximo de un short  --> " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short  --> " + Short.MIN_VALUE);

        System.out.println();

        int numeroInt = 214748364;

        System.out.println("Numero int  --> " + numeroInt);
        System.out.println("Tipo int corresponde en byte a  --> " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a  --> " + Integer.SIZE);
        System.out.println("Valor maximo de un int  --> " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int  --> " + Integer.MIN_VALUE);
        System.out.println();

        long numeroLong = 9223372036854775807L;

        System.out.println("Numero long  --> " + numeroLong);
        System.out.println("Tipo long corresponde en byte a  --> " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a  --> " + Long.SIZE);
        System.out.println("Valor maximo de un long  --> " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long  --> " + Long.MIN_VALUE);
        System.out.println();


    }
}
