import java.util.Scanner;

public class EntradaConTeclado_T1 {
    public static void main(String[] args) {
        //intoducir por teclado: Scanner
        Scanner sc = new Scanner(System.in);

        //Crear variable para guardar el dato que se introduzca
        //sc para String
        String nombre = sc.nextLine();

        //Imprimir en consola
        System.out.println("Hola, "+ nombre);

        //Ejemplo 1: leer valor
        //int para numero y sc para scanner
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        //suma
        int suma =n1 + n2;
        System.out.println("La suma de "+n1+ " + "+ n2 + " es "+ suma);


    }
}
