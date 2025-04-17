package modulo.dos.coderunner;
import modulo.dos.coderunner.FiguraGeometrica;

public class TestFiguraGeometrica {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Círculo Rojo", 5.0);
        Rectangulo rectangulo = new Rectangulo("Rectángulo Azul", 4.0, 6.0);
        // Calcular el área de cada figura
        circulo.calcularArea();
        rectangulo.calcularArea();
    }
}
