package com.training.operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        i+=2; // i = i +2
        System.out.println("i = " + i);
        i+=2;
        System.out.println("i = " + i);

        j-= 4; // j= j- 4
        System.out.println("j = " + j);
        j*= 4; // j= j* 4
        System.out.println("j = " + j);
        
        String sql = "select * from cliestes ";
        sql += "where nombre = 'nasly'";

        System.out.println("sql = " + sql);

    }
}
