package modulo.uno.practico;

public class Operadores {
    public static void main(String[] args) {
        System.out.println(26/4);
        System.out.println(78.5/2);
        System.out.println(105/75);
//        System.out.println(45/0);
        System.out.println(28*4);
        System.out.println((76)-(-12)+(-15));
        System.out.println(10/5+(-3)+1);
        System.out.println(16/3+16/5);
    }
}

/* ANALIZAR EXPRESIONES
* 1 == 2 FALSE
* 1 > 2 FALSE
* 1 <= 2 TRUE
* 1 != 2 TRUE
* 35 < 8/13 FALSE
* 1 < 2 < 3 TRUE
* 1 < 2 < 0 FALSE
* (1 < 2) || (2 < 0) TRUE
* 1 < (1/0) FALSE
* FALSE && (1 < (1/0)) FALSE
* TRUE || (1 < (1/0)) TRUE
* */

/* DADO A = 5, B = 3 Y C = -12:
* A > 3 TRUE
* B < C FALSE
* A * B == 15 TRUE
* A + B + C == 5 FALSE
* A > C TRUE
* B != C TRUE
* A * B == -30 FALSE
* (A + B == 8) && (A - B == -2) = TRUE && FALSE = FALSE
* A / B < 3 TRUE
* A * C > B FALSE
* C / D = 2 TRUE (SI D = -6)
* A * B + C / D > 1 TRUE (PARA TODO D MENOR A 0)
* */
