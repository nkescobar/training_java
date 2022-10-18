package com.training.operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {
        String username = "nkescobar";
        String password = "123456";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username : ");
        String u = scanner.next();

        System.out.println("Ingrese el password: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        if (username.equals(u) && password.equals(p)) {

        }

    }
}
