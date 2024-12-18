package bucleFor;

public class EjercicioFor19 {
    public static void main(String[] args) {
        // se necesita crear una variable que guarde el incremento de cada vuelta
        int suma = 0;

        for (int i = 1; i < 11; i++) {
            suma += i; // suma = suma + i
            System.out.println("suma: " + suma + " i = " + i);
        }
    }
}
