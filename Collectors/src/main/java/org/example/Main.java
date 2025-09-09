package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Collectors.toList
        List<String> nombres = List.of("Luisiana", "Ibra", "Suscribite", "Todocode");
        List<String> nombresConA = nombres.stream()
                .filter(nombre -> nombre.toLowerCase().contains("a"))
                .collect(Collectors.toList());

        nombresConA.forEach(System.out::println);

        //Collectors.toSet
        List<String> lenguajes = List.of("java", "python", "java", "php", "javascript");
        Set<String> sinRepetidos = lenguajes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        sinRepetidos.forEach(System.out::println);

        //Collectors.joining()
        List<String> sgbds = List.of("MySQL", "Oracle", "PostgreSQL");
        String listaTecnologias = sgbds.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" | "))
                .toString();

        System.out.println(listaTecnologias);

        //Collectors.counting()
        List<String> paises = List.of("Argentina", "Brasil", "Colombia", "Chile", "Ecuador", "Paraguay", "Perú", "Uruguay", "Venezuela", "Litruania", "Laos");

        Long cantidadPaises = paises.stream()
                .filter(pais -> pais.startsWith("L"))
                .collect(Collectors.counting());

        System.out.println("Cantidad de países que empiezan con L: " + cantidadPaises);

        //Collectors.partitioningBy()
        List<Integer> edades = List.of(13, 15, 20, 21, 35, 33, 32, 48, 57, 12, 10);
        edades.stream()
                .collect(Collectors.partitioningBy(edad -> edad >= 18))
                .forEach((esMayor, listaEdades) -> {
                    if (esMayor) {
                        System.out.println("Mayores de edad: " + listaEdades);
                    } else {
                        System.out.println("Menores de edad: " + listaEdades);
                    }
                });

        Map<Boolean, List<Integer>> mayores = edades.stream()
                .collect(Collectors.partitioningBy(edad -> edad >= 18));
        System.out.println(mayores);

    }
}