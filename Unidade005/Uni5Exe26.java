package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe26 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		int trechoPedagio = 0; int trechoTotal = 0; int trechoLongo = 0; double preco; double distancia; double limiteDistancia = 150.0;

		System.out.print("limite de pedagio: ");
		double limitePreco = terminal.nextDouble();


		while (true) {
			System.out.print("preco do pedagio: ");
			preco = terminal.nextDouble();

			if (preco == -1)
				break;

			System.out.print("distancia: ");
			distancia = terminal.nextDouble();

			if (preco > limitePreco)
				trechoPedagio++;
			else if (distancia > limiteDistancia)
				trechoLongo++;

			trechoTotal++;
		}

		System.out.printf("%d (trechos com valor acima do qual ele nega-se a pagar)\n", trechoPedagio);
		System.out.printf("%d (quantidade de trechos informados)\n", trechoTotal);
		System.out.printf("%d (trechos acima de 150km com valor aceito por ele)\n", trechoLongo);

		terminal.close();
	}
}
