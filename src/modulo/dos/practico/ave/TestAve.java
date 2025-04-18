package modulo.dos.practico.ave;

public class TestAve {
    public static void main(String[] args) {
        Aguila aguila = new Aguila(4.99);
        aguila.volarAlto();
        Canario canario = new Canario("amarillo", "canto vehemente y cálido");
        canario.cantar();
        System.out.println("El canario es de color: " + canario.getColor());
        canario.setColor("azul");
        System.out.println("El canario es de color: " + canario.getColor());
    }
}
