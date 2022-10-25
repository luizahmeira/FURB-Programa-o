package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe32 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.print("dia: ");
		int d = terminal.nextInt();

		int j = 1;


		System.out.printf("D\tS\tT\tQ\tQ\tS\tS\n");
		for (int i = 1; i < 36; i++) {
			if (i > d - 1 && j < 31) {
				System.out.print(j);
				j++;
			} else
				System.out.print(' ');
			if (i % 7 == 0)
				System.out.print('\n');
			else
				System.out.print('\t');

		}

		terminal.close();
	}
}