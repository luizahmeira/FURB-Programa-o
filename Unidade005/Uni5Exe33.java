package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe33 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		int totalVotos = 0;
		int totalGrupo1 = 0;
		int totalGrupo2 = 0;
		int totalGrupo3 = 0;
		int totalGrupo4 = 0;
		int totalGrupo5 = 0;
		int totalGrupo6 = 0;


		int voto;

			do {
				System.out.print("voto: ");
				voto = terminal.nextInt();

				switch (voto) {
					case 0:
						break;

					case 1:
						totalVotos++;
						totalGrupo1++;
						break;

					case 2:
						totalVotos++;
						totalGrupo2++;
						break;

					case 3:
						totalVotos++;
						totalGrupo3++;
						break;

					case 4:
						totalVotos++;
						totalGrupo4++;
						break;

					case 5:
						totalVotos++;
						totalGrupo5++;
						break;

					case 6:
						totalVotos++;
						totalGrupo6++;
						break;
					default:
						System.out.println("Opção incorreta");
				}

			} while (voto != 0);

		System.out.printf("total de votos: %d\n", totalVotos);
		System.out.printf("total candidato 1: %d\n", totalGrupo1);
		System.out.printf("total candidato 2: %d\n", totalGrupo2);
		System.out.printf("total candidato 3: %d\n", totalGrupo3);
		System.out.printf("total candidato 4: %d\n", totalGrupo4);
		System.out.printf("total nulo: %.2f%%\n", (double) totalGrupo5 / totalVotos * 100);
		System.out.printf("total branco: %.2f%%\n", (double) totalGrupo6 / totalVotos * 100);

		terminal.close();
	}
}
