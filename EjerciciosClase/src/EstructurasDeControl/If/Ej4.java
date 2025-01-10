package EstructurasDeControl.If;

import java.util.Scanner;

public class Ej4 {
    /*
     * Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se comparan con dos valores guardados previamente en el programa. Si coinciden, se indica “Has entrado al sistema”, en caso contrario se indica que usuario y/o contraseña son incorrectos.
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre de usuario correcto: ");
        String nombre = sc.nextLine();
        System.out.println("Dime la contraseña correcta: ");
        String contra = sc.nextLine();

        if (nombre.equals("david") && contra.equals("admin")) {
            System.out.println("Has entrado al sistema");
        } else
            System.out.println("El usuario y/o contraseña esta incorrecto");
    }
}
