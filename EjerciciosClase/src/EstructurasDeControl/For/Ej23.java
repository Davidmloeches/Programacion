package EstructurasDeControl.For;

import java.util.Scanner;

/*
*[FOR ANIDADO] Escribe un programa que, dado un número n introducido por teclado, dibuje un cuadrado de dimensiones n * n, con un carácter también introducido por teclado. Ejemplo
* */
public class Ej23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("#");

            }
        }

    }
}
