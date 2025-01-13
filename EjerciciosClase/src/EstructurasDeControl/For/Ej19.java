package EstructurasDeControl.For;
/*
*Hacer un programa que calcule la suma de los números enteros del 1 al 10 (inclusive) usando el bucle for.
 * */
public class Ej19 {
    public static void main(String[] args) {
        int suma=0;
        for (int i = 1; i <= 10; i++) {
            suma +=i;
        }
        System.out.println(suma);
    }
}
