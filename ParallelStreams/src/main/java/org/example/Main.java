package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Stream secuencial
        long tiempoInicio = System.nanoTime();
        Arrays.stream(numeros).forEach(n -> System.out.println("Secuencial " + n));
        long tiempoFin = System.nanoTime();
        long duracionSecuencial = tiempoFin - tiempoInicio;
        // Pasar a milisegundos
        System.out.println("Tiempo secuencial: " + duracionSecuencial / 1_000_000 + " ms");
        System.out.println("Tiempo secuencial: " + duracionSecuencial + " nanosegundos");

        System.out.println("------------------------");

        // Parallel Stream
        tiempoInicio = System.nanoTime();
        Arrays.stream(numeros).parallel().forEach(n -> System.out.println("Paralelo " + n));
        tiempoFin = System.nanoTime();
        duracionSecuencial = tiempoFin - tiempoInicio;
        System.out.println("Tiempo paralelo: " + duracionSecuencial / 1_000_000 + " ms");
        System.out.println("Tiempo paralelo: " + duracionSecuencial + " nanosegundos");
    }
}