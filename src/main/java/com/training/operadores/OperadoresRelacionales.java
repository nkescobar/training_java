package com.training.operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double ñ = 2.143e3;
        
        boolean m= false;
        
        boolean b1 = i == j;
        System.out.println("b1 = " + b1);

        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        boolean b3 = i != j;
        System.out.println("b3 = " + b3);

        boolean b4 = m == true;
        System.out.println("b4 = " + b4);

        boolean b6 = i > j;
        System.out.println("b6 = " + b6);

        boolean b7 = i < j;
        System.out.println("b7 = " + b7);
    }
}
