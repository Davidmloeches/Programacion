package EstructurasDeControl.For;

/*
 *Hacer un programa que calcule la suma y el producto de los 30 primeros números naturales. (El 0 no cuenta)
 * */
public class Ej26 {
    public static void main(String[] args) {
        int suma = 0;
        long producto = 1;

        for (int i = 1; i <= 30; i++) {
            suma += i;
            producto *= i;
        }
        System.out.println("La suma de todos es: " + suma);
        System.out.println("El producto de todos es: " + producto);
    }
}
