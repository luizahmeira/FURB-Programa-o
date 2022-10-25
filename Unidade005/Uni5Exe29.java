package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe29 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.print("valor: ");
        int notas = terminal.nextInt();

		System.out.println("notas: ");
        System.out.printf("%d nota(s) de R$ 20\n",	notas / 20);	notas %= 20;
        System.out.printf("%d nota(s) de R$ 10\n",	notas / 10);	notas %= 10;
        System.out.printf("%d nota(s) de R$ 5\n",	notas / 5);		notas %= 5;
        System.out.printf("%d nota(s) de R$ 2\n",	notas / 2);		notas %= 2;
        System.out.printf("%d nota(s) de R$ 1\n",	notas);
		terminal.close();
	}
}
