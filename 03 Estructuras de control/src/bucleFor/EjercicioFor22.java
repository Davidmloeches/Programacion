package bucleFor;
/**
 * Hacer un programa que genere 10 números aleatoriamente y calcule su media
 * */
public class EjercicioFor22 {
    public static void main(String[] args) {

        for (int numrandom = 0; numrandom < 10; numrandom++) {
            int numRandom = (int)(Math.random()*11);
            System.out.println(numRandom);


        }




    }
}
