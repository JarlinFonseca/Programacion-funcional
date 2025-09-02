package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // Referencia a método estático
        //Function un parametro de entrada y uno de salida
        Function<Integer, String> convertidor = String::valueOf;
        String resultado = convertidor.apply(35);
        System.out.println("El resultado es: " + resultado);

        // Referencia a método de instancia de un objeto
        Persona persona = new Persona();
        persona.nombre = "Jarlin";

        // Runnable solo ejecuta
        Runnable saludo = persona::saludar;
        saludo.run();

        //Referencia a un constructor
        BiFunction<String, Double, Persona2> crearPersona = Persona2::new;
        Persona2 persona2 = crearPersona.apply("Jarlin Fonseca", 1.76);
        persona2.saludar();
        System.out.println("La persona es " + persona2);

        //Referencia a método de instancia de un objeto arbitrario
        List<Persona2> personas = new ArrayList<>();
        personas.add(new Empleado());
        personas.add(new Gerente());
        personas.add(new Empleado());
        personas.add(new Gerente());

        personas.forEach(Persona2::saludar);


    }
}