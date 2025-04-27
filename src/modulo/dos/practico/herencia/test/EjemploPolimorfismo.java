package modulo.dos.practico.herencia.test;

public class EjemploPolimorfismo {
    static class S {
        public double prueba = 0;

        public S(double a) {
            this.prueba = a * 2;
        }

        public S(){}

        public int suma(int a, int b){
            return a+b;
        }
    }

    static class T extends S {
        public T(){}

        public T(int a, int b){
            super(a);
        }

        public double suma(double a, double b){
            return a+b;
        }
    }

    public static void main(String[] args) {
        T test = new T(1, 3);
        System.out.println(test.suma(5,5));
        System.out.println(test.suma(3.0,5));
        System.out.println(test.prueba);
    }
}