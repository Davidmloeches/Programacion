package condicional_IF;

import java.util.Scanner;

public class EjercicioIf04 {
    public static void main(String[] args) {
        // ponemos un usuario y una contraseña
        String usu = "david";
        String contra = "admin";

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un nombre de Usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Contraseña: ");
        String contraseña = sc.nextLine();

        //tenemos que compararlo
        // Cuando se comparan Strings, se tiene que hacer obligatoriamente con cadena1.equals(cadena2) -> si las dos cadenas son iguales devolverá true

        if (usuario.equals(usu) && contraseña.equals(contra)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }
}
