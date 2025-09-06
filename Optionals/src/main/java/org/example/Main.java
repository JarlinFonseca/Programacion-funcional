package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String>  stringNull = Optional.ofNullable(null);

        if(stringNull.isEmpty()){
            System.out.println("El valor es vacío");
        }

        if (stringNull == null) {
            System.out.println("El valor es null");
        }

        Optional<String>  cadena = Optional.of("Hola Mundo");
        if(cadena.isPresent()){
            System.out.println(cadena.get());
        }
    }
}