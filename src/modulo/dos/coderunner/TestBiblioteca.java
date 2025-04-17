package modulo.dos.coderunner;

public class TestBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Central", 100);
        biblioteca1.prestarLibro();
        biblioteca1.devolverLibro();
        System.out.println(biblioteca1.toString());

        Biblioteca biblioteca2 = new Biblioteca("Biblioteca Central", 50);
        biblioteca2.prestarLibro();
        System.out.println(biblioteca2.toString());
    }
}
