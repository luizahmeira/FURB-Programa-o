package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe31 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

    	int numero;

		System.out.print("numero: ");
		numero = terminal.nextInt();

		for (int i = 2; i < numero; i++)

			while (numero % i == 0) {
				System.out.printf("%d, %d\n", numero, i);
				numero /= i;
			}

		if (numero > 2)
			System.out.println(numero);

		terminal.close();
	}
}
