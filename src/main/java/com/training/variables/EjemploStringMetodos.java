package com.training.variables;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Nasly";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println(" nombre.equals(\"Nasly\")= " + nombre.equals("Nasly"));
        System.out.println(" nombre.equals(\"nasly\")= " + nombre.equals("nasly"));
        System.out.println(" nombre.equalsIgnoreCase(\"nasly\")= " + nombre.equalsIgnoreCase("nasly"));
        System.out.println(" nombre.compareTo(\"nasly\")= " + nombre.compareTo("Nasly"));
        System.out.println(" nombre.compareTo(\"Kathy\")= " + nombre.compareTo("Kathy"));
        System.out.println("nombre.charAt(0) = "+ nombre.charAt(0));
        System.out.println("nombre.charAt(1) = "+ nombre.charAt(1));
        System.out.println("nombre.charAt(5) = "+ nombre.charAt(nombre.length() -1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
    }
}
