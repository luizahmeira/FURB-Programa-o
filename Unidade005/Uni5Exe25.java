package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe25 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

    int jogadorUm = 0; int jogadorDois = 0; char jogador;

    while (true) {
      System.out.print("ponto da vez: ");
      jogador = terminal.nextLine().toUpperCase().charAt(0);
      if (jogador == 'D')
        jogadorUm++;
      else
        jogadorDois++;

      if (jogadorUm > 20 && jogadorUm - jogadorDois > 2) {
        System.out.println("vencedor: D");
        break;
      } else if (jogadorDois > 20 && jogadorDois - jogadorUm > 2) {
        System.out.println("vencedor: E");
        break;
      }
      
    }

		terminal.close();
	}
}
