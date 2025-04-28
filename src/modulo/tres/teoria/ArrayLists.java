package modulo.tres.teoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        Integer[] numeros = {15, 29, 34, 50, 60, -9, 38};

        ArrayList<Integer> arrDinamico = new ArrayList<>(Arrays.asList(numeros));

        arrDinamico.add(29);
        arrDinamico.remove(2);
        Collections.sort(arrDinamico);

        System.out.println(arrDinamico);
    }
}
