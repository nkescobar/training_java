package com.training.variables;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);
        System.out.println("nombreA2 = " + nombreA2);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);
        System.out.println("nombreB2 = " + nombreB2);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);
        System.out.println("nombreC2 = " + nombreC2);

        String resultado = nombreA2.concat("_").concat(nombreB2).concat("_").concat(nombreC2);
        System.out.println("resultado = " + resultado);
    }
}
