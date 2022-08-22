/*
 *  Javier Martínez del Campo González (201507)
 *  
 */
package distanciaEntreCadenas;

/**
 *
 * @author javier
 */
public class distanciaEntreCadenas {
    
    public static int calculaDistancia(String s1, String s2) {
        return calculaDistancia(s1, s2, 0);
    }
    
    private static int calculaDistancia(String s1, String s2, int cont) {
        if(s1.length() == 0 || s2.length() == 0)
            return cont + s1.length() + s2.length();
        if(s1.charAt(cont) == s2.charAt(cont))
            return calculaDistancia(s1.substring(1), s2.substring(1), cont);
        int sust = calculaDistancia(s1.substring(1), s2.substring(1), cont + 1); // sustituye
        int insr = calculaDistancia(s1.substring(1), s2, cont + 1); // inserta en s2
        int elim = calculaDistancia(s1, s2.substring(1), cont + 1); // elimina en s2
        return minimo(sust, insr, elim);
    }
    
    private static int minimo(int a, int b, int c){
        if(a < b)
            return Integer.min(a, c);
        else
            return Integer.min(b, c);
    }
    
    public static void main(String[] args) {
        
        System.out.println(calculaDistancia("hola", "holse"));
    }
    
}
