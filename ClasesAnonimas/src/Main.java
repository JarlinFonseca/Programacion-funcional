public class Main {
    public static void main(String[] args) {

        Animal perro = new Animal() {
            @Override
            public void hacerSonido() {
                System.out.println("Hola yo ladro guau guau");
            }
        };

        perro.hacerSonido();
    }

}