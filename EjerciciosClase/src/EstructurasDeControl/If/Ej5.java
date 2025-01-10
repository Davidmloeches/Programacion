package EstructurasDeControl.If;

import java.util.Scanner;

public class Ej5 {
    /*
     * Escribe el mismo programa anterior, pero indicando exactamente qué es lo que es incorrecto: si el usuario, la contraseña o ambos
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = "david";
        String contra = "1234";

        System.out.println("Dime el nombre de usuario correcto: ");
        String nombreIngresado = sc.nextLine();
        System.out.println("Dime la contraseña correcta: ");
        String contraIngresado = sc.nextLine();

        if (nombreIngresado.equals(usuario) && contraIngresado.equals(contra)) {
            System.out.println("Has entrado al sistema");
        } else if (!nombreIngresado.equals(usuario) && contraIngresado.equals(contra)) {
            System.out.println("El usuario no es correcto");
        } else if (nombreIngresado.equals(usuario) && !contraIngresado.equals(contra)) {
            System.out.println("La contraseña no es correcta");
        } else if (!nombreIngresado.equals(usuario) && !contraIngresado.equals(contra)) {
            System.out.println("El usuario y la contraseña incorrecta");
        }

    }
}
