package modulo.pruebafinal;
//
//// Clase abstracta Figura
//
//abstract class Figura {
//    String tipo;
//    public Figura(String tipo) {
//        this.tipo = tipo;
//    }
//
//    public abstract double calcularArea();
//}
//
//// Clase Rectangulo
//
//class Rectangulo extends Figura{
//    private double lado1;
//    private double lado2;
//
//    public Rectangulo(double lado1, double lado2) {
//        super("Rectangulo");
//        this.lado1 = lado1;
//        this.lado2 = lado2;
//    }
//    @Override
//    public double calcularArea() {
//        return lado1*lado2;
//    }
//}
//
//// Clase Circulo
//
//class Circulo extends Figura{
//    private double radio;
//
//    public Circulo(double radio) {
//        super("Circulo");
//        this.radio = radio;
//    }
//    @Override
//    public double calcularArea() {
//        return Math.PI * Math.pow(radio, 2);
//    }
//}
//
//// Clase Triangulo
//
//class Triangulo extends Figura{
//    private double base;
//    private double altura;
//
//    public Triangulo(double base, double altura) {
//        super("Triangulo");
//        this.base = base;
//        this.altura = altura;
//    }
//
//    @Override
//    public double calcularArea() {
//        return base * altura /2;
//    }
//}
//
//
//
//class Mostrar {
//    public static void mostrarDatos(java.util.List<Figura> figuras ){
//        // se debe recorrer toda la lista e ir mostrando por consola de que tipo de clase
//        // que se esta recorriendo (tienen 3 clases posibles).
//        // El nombre de las clases a mostrar deben ser como estan definidas en las respectivas clases. (Circulo)
//        // y ademas se debe sumar todas las areas de las diferentes figuras que estan en la lista
//        // de nombre figuras, y luego mostrar el resultado en la consola.
//
//        // Aca debe agregar el código
//        double areaSumada = 0;
//
//        for (Figura fig : figuras){
//            System.out.println(fig.tipo);
//            areaSumada += fig.calcularArea();
//        }
//
//        System.out.println(areaSumada);
//
//
//    }
//}

