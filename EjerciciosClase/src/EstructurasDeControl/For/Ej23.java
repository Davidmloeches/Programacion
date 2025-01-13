package EstructurasDeControl.For;

import java.util.Scanner;

/*
*[FOR ANIDADO] Escribe un programa que, dado un número n introducido por teclado, dibuje un cuadrado de dimensiones n * n, con un carácter también introducido por teclado. Ejemplo
* */
public class Ej23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Dime un numero de cuantas dimensiones quieres el cuadrado: ");
        int num = sc.nextInt();
        System.out.println("Que caracter quieres que salga?");
        char caracter = sc.next().toLowerCase().charAt(0);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(caracter);

            }
            System.out.println();
        }

    }
}
