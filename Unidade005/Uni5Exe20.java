package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe20 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

        System.out.print("Informe a massa inicial em [kg]: ");
        double mInicial = terminal.nextDouble();

        double massa = mInicial; int segundos = 0;

        while (massa > 0.0005) {
            massa *= 0.5;
            segundos += 50;
        }

        System.out.printf("massa final em [kg] é: %f\n", massa);
        System.out.printf("segundos passados: %d\n", segundos);

		terminal.close();
	}
}
