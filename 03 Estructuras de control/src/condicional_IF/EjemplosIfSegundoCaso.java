package condicional_IF;

import java.util.Scanner;

public class EjemplosIfSegundoCaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad: ");
        int edad = sc.nextInt();

        //todos los datos relacionales dan como resultado true o falso porque dan booleans
        if(edad>=18){
            System.out.println("Eres mayor");
        }else {
            System.out.println("Eres menor");
        }

    }
}
