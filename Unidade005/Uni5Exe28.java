package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe28 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		int totalVotos = 0;
		int totalGrupo1 = 0;
		int totalGrupo2 = 0;
		int totalGrupo3 = 0;
		int totalGrupo4 = 0;

		int voto;

		while (true) {
		
			System.out.print("voto: ");
			voto = terminal.nextInt();

			switch (voto) {
				case 1:
					totalGrupo1++;
					break;
				case 2:
					totalGrupo2++;
					break;
				case 3:
					totalGrupo3++;
					break;
				case 4:
					totalGrupo4++;
					break;
				default:
					System.out.println("voto invalido!");
			}
			totalVotos++;

			System.out.print("mais um voto: s (SIM) / n (NAO)? ");
			terminal.nextLine();
			if (terminal.nextLine().charAt(0) == 'n')
				break;
		}

		System.out.printf("total de votos: %d\n", totalVotos);
		System.out.printf("total grupo 1: %.2f%%\n", (double) totalGrupo1 / totalVotos * 100);
		System.out.printf("total grupo 2: %.2f%%\n", (double) totalGrupo2 / totalVotos * 100);
		System.out.printf("total grupo 3: %.2f%%\n", (double) totalGrupo3 / totalVotos * 100);
		System.out.printf("total grupo 4: %.2f%%\n", (double) totalGrupo4 / totalVotos * 100);

		// extrema preguiça.
		if (totalGrupo1 > totalGrupo2 &&
			totalGrupo1 > totalGrupo3 &&
			totalGrupo1 > totalGrupo4)
			System.out.println("vencedor: grupo 1");
		else if
			(totalGrupo2 > totalGrupo1 &&
			totalGrupo2 > totalGrupo3 &&
			totalGrupo2 > totalGrupo4)
			System.out.println("vencedor: grupo 2");
		else if
			(totalGrupo3 > totalGrupo2 &&
			totalGrupo3 > totalGrupo1 &&
			totalGrupo3 > totalGrupo4)
			System.out.println("vencedor: grupo 3");
		else if
			(totalGrupo4 > totalGrupo2 &&
			totalGrupo4 > totalGrupo3 &&
			totalGrupo4 > totalGrupo1)
			System.out.println("vencedor: grupo 4");
		else
			System.out.println("empate!");

		terminal.close();
	}
}
