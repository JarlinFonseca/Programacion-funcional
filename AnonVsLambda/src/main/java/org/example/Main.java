package org.example;

public class Main {
    public static void main(String[] args) {
        // resuelto con clases anónimas
        Operador suma = new Operador() {
            @Override
            public int operar(int num1, int num2) {
                return num1 + num2;
            }
        };

        System.out.println("Suma anónima " +suma.operar(5, 3));

        // resuelto con expresiones lambda
        Operador sumaLambda = (num1, num2)  -> num1 + num2;
        System.out.println("Suma lambda " +sumaLambda.operar(10, 657474));


    }
}