package org.example;

import org.example.logica.Auto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Auto> listaAutos = Arrays.asList(
                new Auto("Volkswagen", "Amarok", 25000),
                new Auto("Volkswagen", "Taos", 32000),
                new Auto("Chevrolet", "Onix", 22000),
                new Auto("Chevrolet", "Tracker", 30000),
                new Auto("Fiat", "Cronos", 21000),
                new Auto("Fiat", "Pulse", 24000),
                new Auto("Toyota", "Corolla", 28000),
                new Auto("Toyota", "Yaris", 23000),
                new Auto("Renault", "Stepway", 20000),
                new Auto("Renault", "Duster", 27000),
                new Auto("Nissan", "Versa", 25000)
        );

        // 1. Ordenar por precio de menor a mayor mediante sort
        System.out.println("----- Ordenar por precio de menor a mayor -----");
       List<Auto> ordenPrecio = new ArrayList<>(listaAutos);
       ordenPrecio.sort(Comparator.comparingDouble(Auto::getCosto));
       ordenPrecio.forEach(System.out::println);
        System.out.println("--------------------------------------------------");

       // Odernas por precio de menor a mayor usando stream
         System.out.println("----- Ordenar por precio de menor a mayor usando stream -----");
         listaAutos.stream()
                 .sorted(Comparator.comparingDouble(Auto::getCosto))
                 .forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        // 2. Ordenar por marca y luego por precio usando sorted()
        System.out.println("----- Ordenar por marca y luego por precio -----");
        listaAutos.stream()
                .sorted(Comparator.comparing(Auto::getMarca)
                        .thenComparing(Auto::getCosto))
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        // 3. Autos cuyo precio no supere los 23000

        System.out.println("----- Autos cuyo precio no supere los 23000 -----");
        listaAutos.stream()
                .filter(auto -> auto.getCosto() <= 23000)
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        // 4. Autos de marca Chevrolet o Volkswagen
        System.out.println("----- Autos de marca Chevrolet o Volkswagen -----");
        listaAutos.stream()
                .filter(
                        auto ->
                                auto.getMarca().equals("Chevrolet") ||
                                        auto.getMarca().equals("Volkswagen"))
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        // 5. Autos cuyo modelo contenga al menos una "a"
        System.out.println("----- Autos cuyo modelo contenga al menos una 'a' -----");
        listaAutos.stream()
                .filter(auto -> auto.getModelo().toLowerCase().contains("a"))
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------");


    }
}