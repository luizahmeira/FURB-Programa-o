package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe21 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

        double alturaChico = 1.5; double alturaZeh = 1.10; int anos = 0;

        while (alturaChico > alturaZeh) {
            alturaChico += 0.02;
            alturaZeh += 0.03;
            anos++;
        }

        System.out.printf("anos: %d\n", anos);

		terminal.close();
	}
}
