package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe19 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

    double valor;    double total = 0;

    while (true) {
      System.out.print("valor da compra: ");
      valor = terminal.nextDouble();

      if (valor == 0)
        break;

      if (valor > 500)
        valor *= 0.8;
      else
        valor *= 0.95;

      total += valor;
      
      System.out.printf("total a pagar: %.2f R$\n", valor);
    } 

    System.out.printf("total recebido: %.2f R$\n", total);

		terminal.close();
	}
}
