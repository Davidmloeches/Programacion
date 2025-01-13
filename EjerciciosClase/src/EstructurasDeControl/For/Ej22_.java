package EstructurasDeControl.For;
/*
* Hacer un programa que genere 10 números aleatoriamente y calcule su media.
 * */
public class Ej22_ {
    public static void main(String[] args) {
        int media=0;

        for (int i = 0; i < 10; i++) {
            int aleatorio = (int)(Math.random()*100);
            System.out.println(aleatorio);
            
        }


    }
}
