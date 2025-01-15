package EstructurasDeControl.WhileAndDoWhile;

import java.util.Scanner;

/*
* Escribe un programa que solicite al usuario un número entre 1 y 100, ambos inclusive. Si se introduce un número fuera del intervalo debe indicarlo mediante un error y seguir pidiendo el número hasta que se introduzca el número en el rango indicado. Al terminar debe imprimir por pantalla el número introducido.
* */
public class Ej32_ {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Introduce un número entre 1 y 100: ");
            num = sc.nextInt();

            if (num >= 1 && num <= 100) {
                break; // El número está en el rango, salimos del bucle
            } else {
                System.out.println("Error: El número no está en el rango permitido (1-100). Intenta de nuevo.");
            }
        }

        System.out.println("Número introducido: " + num);



    }
}
