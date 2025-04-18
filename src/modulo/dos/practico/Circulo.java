package modulo.dos.practico;

public class Circulo {
    public static final double PI = 3.14159265358979323846;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}
