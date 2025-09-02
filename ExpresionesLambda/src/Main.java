import com.jarlinfonseca.logica.Mensajero;

public class Main {
    public static void main(String[] args) {
        /*
           public void emitirMensaje(String nombre) {
            System.out.println("Hola desde clase anonima " + nombre);
        }
        */

        Mensajero mensajero = (nombre, edad) -> {
            System.out.println("Hola desde lambda " + nombre);
            System.out.println("Su edad es: " + edad);
        };
        mensajero.emitirMensaje("Jarlin", 24);
    }
}