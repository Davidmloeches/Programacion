package condicional_IF;

import java.util.Scanner;

public class EjercicioIf13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige: \n 1 - arriba, 2 - abajo, 3 - izquierda, 4 - derecha, 0 – no mover");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Arriba");
        } else if (num == 2) {
            System.out.println("Abajo");
        } else if (num == 3) {
            System.out.println("Izquierda");
        } else if (num == 4) {
            System.out.println("derecha");
        } else if (num == 0) {
            System.out.println("no mover");
        } else {
            System.out.println("¡ERROR! elige del 0 al 4");
        }

        switch (num) {
            case 1:
                System.out.println("arriba");
                break;
            case 2:
                System.out.println("abajo");
                break;
            case 3:
                System.out.println("izquierda");
                break;
            case 4:
                System.out.println("derecha");
                break;
            case 0:
                System.out.println("no mover");
                break;
            default:
                System.out.println("¡ERROR! elige del 0 al 4");
        }

    }
}
