package modulo.cuatro.coderunner.tres;

public class Main {
    public static void main(String[] args) {
        DispositivoElectronico televisor = new Televisor();
        DispositivoElectronico laptop = new Laptop();

        televisor.encender();
        televisor.apagar();
        System.out.println("-------------");

        laptop.encender();
        laptop.apagar();
    }
}
