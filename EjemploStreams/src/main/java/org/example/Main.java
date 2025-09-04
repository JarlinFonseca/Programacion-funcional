package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Jarlin");
        nombres.add("A TodoCode");
        nombres.add("Java");

        nombres.stream().forEach(System.out::println);

        System.out.println("--- Filtrando ---");

        List<String> paises = Arrays.asList(
                "Colombia", "Perú", "México", "Argentina",
                "Ecuador", "Chile", "Italia", "Alemania", "Portugal", "Francia", "España");

        paises.stream()
                .filter(pais -> pais.toLowerCase().contains("a"))
                .sorted()
                .forEach(System.out::println);
    }
}