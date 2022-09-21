import java.util.Scanner;
public class Uni4Exe13 {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
        System.out.println("Informe as 3 cartas: ");
        int carta1 = terminal.nextInt();
        int carta2 = terminal.nextInt();
        int carta3 = terminal.nextInt();
        int cartasBoas = 0;

        if(carta1 == 1 || carta1 == 2 || carta1 == 3) {
            cartasBoas++;
        }
        if(carta2 == 1 || carta2 == 2 || carta2 == 3) {
            cartasBoas++;
        }
        if(carta3 == 1 || carta3 == 2 || carta3 == 3) {
            cartasBoas++;
        }
        if(cartasBoas == 1) {
            System.out.println("TRUCO");
        } else if(cartasBoas == 2) {
            System.out.println("SEIS");
        } else if(cartasBoas == 3) {
            System.out.println("NOVE");
        }
    terminal.close();
  }  
}
