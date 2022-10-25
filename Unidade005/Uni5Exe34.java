package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe34 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		int contasEncerradas = 0;

		int opcao;
		int diarias;
		double total;

		do {
			System.out.print("opcao: ");
			opcao = terminal.nextInt();

			if (opcao == 1) {
				System.out.print("nome: ");
				terminal.nextLine();
				System.out.printf("nome: %s\n", terminal.nextLine());

				System.out.print("diarias: ");
				diarias = terminal.nextInt();

				if (diarias < 15)
					total = diarias * 7.5;
				else if (diarias < 16)
					total = diarias * 6.0;
				else
					total = diarias * 5.0;

				System.out.printf("total: %.2f\n", total);

			} else if (opcao == 2) {
				contasEncerradas++;
				System.out.printf("contas encerradas: %d\n", contasEncerradas);
			}


		} while (opcao != 3);

		terminal.close();
	}
}
