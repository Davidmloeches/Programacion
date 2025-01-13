package EstructurasDeControl.If;

import java.util.Scanner;

/*
 * Escribe un programa que lea el número de dirección (1 - arriba, 2 - abajo, 3 - izquierda, 4 - derecha, 0 – no mover) y muestre el texto « subir », o «bajar», o « mover a la izquierda », o« mover a la derecha », o« no mover », según el número introducido). Si es un número que no pertenece a ninguna de las direcciones enumeradas, el programa debería generar: « ¡error! »
 * */
public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1- arriba \n2- abajo \n3- izquierda \n4- derecha \n0- no mover \n-------------- \nElige una de las opciones:");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("subir");
        } else if (num == 2) {
            System.out.println("bajar");
        } else if (num == 3) {
            System.out.println("mover a la izquierda");
        } else if (num == 4) {
            System.out.println("mover a la derecha");
        } else if (num == 0) {
            System.out.println("no mover");
        } else {
            System.out.println("« ¡error! »");
        }
    }
}
