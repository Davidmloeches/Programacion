package condicional_IF;

import java.util.Scanner;

public class EjercicioIf05 {
    public static void main(String[] args) {
        // ponemos un usuario y una contraseña
        String usu= "david";
        String contra = "admin";

        Scanner sc =new Scanner(System.in);
        System.out.println("Dime un nombre de Usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Contraseña: ");
        String contraseña = sc.nextLine();

        //comparamos

        if (usuario.equals(usu)){
            //una vez que se que el usuario coincide, compruebo la contraseña

        }
    }
}
