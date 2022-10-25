package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe18 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

    int quatro = 0;    int cinco = 0;    int nove = 0;    int doze = 0;    int total = 0;    double porcentagem;    int canal;

    while (true) {
      System.out.print("canal: ");
      canal = terminal.nextInt();

      if (canal == 0)
        break;

      switch (canal) {
        case 4:
          quatro++;
          break;
        case 5:
          cinco++;
          break;
        case 9:
          nove++;
          break;
        case 12:
          doze++;
          break;
      }
      total++;
    }
  
    porcentagem = (double) quatro / total * 100;
    System.out.printf("audiencia do canal 4: %.2f%%\n", porcentagem);

    porcentagem = (double) cinco / total * 100;
    System.out.printf("audiencia do canal 5: %.2f%%\n", porcentagem);

    porcentagem = (double) nove / total * 100;
    System.out.printf("audiencia do canal 9: %.2f%%\n", porcentagem);

    porcentagem = (double) doze / total * 100;
    System.out.printf("audiencia do canal 12: %.2f%%\n", porcentagem);

		terminal.close();
	}
}