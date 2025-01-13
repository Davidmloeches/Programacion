package EstructurasDeControl.If;

import java.util.Scanner;

/*
 * A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de mantequilla de cacahuete. Pero no debe haber muchas, porque si no enferman. Una fiesta de la marmota exitosa tiene entre 10 y 20 tazas de mantequilla de cacahuete, ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25 tazas.
 * Escribe un programa que lea dos valores:
 *   El primero es el número de tazas de mantequilla de cacahuete que hay en la fiesta.
 *   El segundo es un booleano que indica si es fin de semana.
 * El programa debe imprimir si la fiesta tiene éxito o no (true o false).

 * */
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime cuantas tazas hay en la fiesta:");
        int tazas = sc.nextInt();

        System.out.println("Es fin de semana? (true o false)");
        boolean finDeSemana = sc.nextBoolean();

        if (finDeSemana == true) {
            if (tazas >= 15 && tazas <= 25) {
                System.out.println("Fiesta exitosa");
            } else {
                System.out.println("Fiesta no exitosa");
            }
        } else {
            if (tazas >= 10 && tazas <= 20) {
                System.out.println("Fiesta exitosa");
            } else
                System.out.println("Fiesta no exitosa");
        }
    }
}
