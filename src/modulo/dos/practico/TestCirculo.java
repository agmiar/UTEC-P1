package modulo.dos.practico;

public class TestCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5.0);
        Circulo c2 = new Circulo(3.5);
        Circulo c3 = new Circulo(10.4);
        System.out.printf("Círculo 1: radio = %.2f, perímetro = %.2f, área = %.2f\n",
                c1.getRadio(), c1.calcularPerimetro(), c1.calcularArea());
        System.out.printf("Círculo 2: radio = %.2f, perímetro = %.2f, área = %.2f\n",
                c2.getRadio(), c2.calcularPerimetro(), c2.calcularArea());
        System.out.printf("Círculo 3: radio = %.2f, perímetro = %.2f, área = %.2f\n",
                c3.getRadio(), c3.calcularPerimetro(), c3.calcularArea());
    }
}
