package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe22 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

    double aumento = 0.015 * 2000;    int ano = 1996;

    while (ano < 2022) {
      aumento *= 2;
      ano++;
    }

    System.out.printf("total recebido: %.2f R$\n", aumento);

		terminal.close();
	}
}

