package com.training.lambdas;

public class LambdaTest {
    public static void main(String[] args) {
        FunctionTest functionTest = () -> System.out.println("Hola mundo");
        functionTest.saludar();

        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.miMetodo(functionTest);

        Operaciones operaciones = ((numero1, numero2) -> System.out.println(numero1 + numero2));
        operaciones.imprimeSuma(5,4);

        lambdaTest.calculadora(4,3, (x,y)-> x+y);
        lambdaTest.calculadora(4,3, (x,y)-> x-y);
        lambdaTest.calculadora(4,3, (x,y)-> x*y);
        lambdaTest.calculadora(4,3, (x,y)-> x/y);

    }

    public void miMetodo(FunctionTest parametro ) {
        parametro.saludar();
    }

    public void  calculadora(int numero1, int numero2, Calculadora calculadora) {
        int resultado = calculadora.calcular(numero1,numero2);
        System.out.println("resultado = " + resultado);
    }
}
