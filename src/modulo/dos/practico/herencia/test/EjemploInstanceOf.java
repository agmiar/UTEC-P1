package modulo.dos.practico.herencia.test;

public class EjemploInstanceOf {
    static class Dulce{
        Dulce(){}
    }

    static class DulceMembrillo extends Dulce{
        DulceMembrillo(){}
    }

    static class DulceBatata extends Dulce{
        DulceBatata(){}
    }

    public static void main(String[] args) {
        Dulce dulce = new Dulce();
        DulceMembrillo dulceMembrillo = new DulceMembrillo();
        DulceBatata dulceBatata = new DulceBatata();

        System.out.println(dulce instanceof DulceMembrillo);
        System.out.println(dulceMembrillo instanceof DulceMembrillo);
        System.out.println(dulceBatata instanceof Dulce);
    }
}
