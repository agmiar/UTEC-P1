package modulo.cuatro.coderunner.cuatro;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5.0);
        FiguraGeometrica rectangulo = new Rectangulo(4.0, 6.0);

        circulo.dibujar();
        circulo.calcularArea();
        System.out.println("-------------");

        rectangulo.dibujar();
        rectangulo.calcularArea();
        System.out.println("-------------");
    }
}
