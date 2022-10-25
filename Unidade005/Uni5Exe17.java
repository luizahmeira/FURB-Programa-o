package Unidade005.exercícios;

import java.util.Scanner;
public class Uni5Exe17 {
	public static void main(String[] args) {
		Scanner terminal= new Scanner(System.in);

    int idMenorAltura = 0;    int idMaiorAltura = 0;
    double maiorAltura = Double.MIN_VALUE;    double menorAltura = Double.MAX_VALUE;
    double totalAltura = 0;    int total = 0;
    double altura;    int nInscricao;

    while (true) {
      System.out.print("numero de inscricao: ");
      nInscricao = terminal.nextInt();

      if (nInscricao == 0)
        break;

      System.out.print("altura: ");
      altura = terminal.nextDouble();

      if (altura < menorAltura) {
        menorAltura = altura;
        idMenorAltura = nInscricao;
      } else if (altura > maiorAltura) {
        maiorAltura = altura;
        idMaiorAltura = nInscricao;
      }

      totalAltura += altura;
      total++;

    } 

    System.out.printf("atleta mais baixo: %d com %.2f M\n", idMenorAltura, menorAltura);
    System.out.printf("atleta mais alto: %d com %.2f M\n", idMaiorAltura, maiorAltura);

    totalAltura /= total;
    System.out.printf("media de altura: %.2f M\n", totalAltura);

		terminal.close();
	}
}
