package Variables.EjerciciosVariables;

public class Ej14 {
    public static void main(String[] args) {
        //Ejercicio 14: Validación de rangos Declara una variable de tipo int. Comprueba si el valor está dentro de un rango dado (por ejemplo, entre 10 y 100) usando operadores relacionales y lógicos.

        int num1 = 50;

        // Verificar si el número está dentro del rango [10, 100]
        boolean estaEnRango = num1 >= 10 && num1 <= 100;
        if (estaEnRango) {
            System.out.println("Esta en rango");
        }else {
            System.out.println("No esta en el rango");
        }
    }
}
