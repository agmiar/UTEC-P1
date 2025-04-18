package modulo.dos.practico.herencia;

public class TestHerencia {
    public static void main(String[] args) {
        Id persona = new Id("Armando", "Casas",
                "099654869", "49856944");
        Automovil auto = new Automovil("Chevrolet", "Corsa", persona);
        auto.encender();
        System.out.println(auto.getDuenio().toString());
    }
}
