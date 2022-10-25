package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe30 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.print("N: ");
		int N = terminal.nextInt();

		System.out.print("M: ");
		int M = terminal.nextInt();

		System.out.print("K: ");
		int K = terminal.nextInt();

		int m = 0;
		int total = 0;

		while (N > 0 ) {
			System.out.printf("m=%d, N=%d\n", m, N);
			if (m + N < M + 1) {
				System.out.printf("%d foi colocado na mochila\n", N);
				m += N;
			} else {
				System.out.printf("%d nao foi colocado na mochila\n", N);
				total += N;
			}

			N -= K;
		}

		System.out.printf("total (dentro da mochila): %d\n", m);
		System.out.printf("total (fora da mochila): %d\n", total);

		terminal.close();
	}
}
