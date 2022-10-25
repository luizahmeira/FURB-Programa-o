package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe24 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

    System.out.print("limite diario: ");
    double  limite = terminal.nextDouble(); double total = 0; double peso;

    while (true) {
      System.out.print("peso do peixe: ");
      peso = terminal.nextDouble();
      total += peso;

      if (total > limite) {
        System.out.printf("limite de peso excedido (%.2f kg)\n", total);
        break;
      }

      System.out.print("deseja informar o peso de mais um peixe: s (SIM) / n (NAO)? ");
      terminal.nextLine();

      if (terminal.nextLine().charAt(0) == 'n')
        break;

    }
		terminal.close();
	}
}
