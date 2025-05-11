package modulo.cuatro.coderunner.tres;

public class Televisor extends DispositivoElectronico{
    public Televisor(){
    }

    public void encender() {
        System.out.println("El televisor se enciende y muestra imágenes.");
    }

    public void apagar() {
        System.out.println("El televisor se apaga y la pantalla queda en negro.");
    }
}
