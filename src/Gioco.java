import java.util.Random;
import java.util.Scanner;

public class Gioco {
    public static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int scelta = 0;

        do {
            System.out.print("\n1) Gioca!");
            System.out.print("\n2) Esci!");
            scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    int forzaGiocatore1 = 20;
                    System.out.print("\nGiocatore 1");
                    System.out.print("\nLa tua forza iniziale e: " + forzaGiocatore1);
                    System.out.print("\nLa tua carta e: " + Carte.randomCarte());

                    int forzaGiocatore2 = 30;
                    System.out.print("\nGiocatore 2");
                    System.out.print("\nLa tua forza iniziale e: " + forzaGiocatore2);
                    System.out.print("\nLa tua carta e: " + Carte.randomCarte());


            }

        } while (scelta < 2);
    }
    public enum Carte {
        EROE, VAMPIRO, LICANTROPO;
        private static final Random PRNG = new Random();
        public static Carte randomCarte()  {
            Carte[] carta = values();
            return carta[PRNG.nextInt(carta.length)];
        }
    }
}