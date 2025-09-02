package org.example;

public class Persona2 {

    String nombre;
    double estatura;

    public Persona2(){
    }

    public Persona2(String nombre, double estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public void  saludar(){
        System.out.println( "Hola mi nombre es: " + nombre + " y mi estatura es: " + estatura);
    }

    @Override
    public String toString() {
        return "Persona2{" +
                "nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                '}';
    }
}
