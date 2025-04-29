package modulo.tres.sortandsearch;

public class StringOps {
    public static boolean estarOrdenadas(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int minLen = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) < s2.charAt(i))
                return true;   // s1 va antes
            if (s1.charAt(i) > s2.charAt(i))
                return false;  // s2 va antes
            // si son iguales, seguimos comparando
        }

        // Si son iguales hasta donde compararon, va primero la más corta
        return s1.length() <= s2.length();
    }
}
