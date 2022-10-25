package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe23 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

    int n;
    String nome, next;
    double total, salario, preco;

    while (true) {
      System.out.print("nome do funcionario: ");
      nome = terminal.nextLine();

      System.out.print("numero de vendas: ");
      n = terminal.nextInt();

      total = 0;
      salario = 0;

      for (int i = 0; i < n; i++) {
        System.out.print("preco da venda: ");
        preco = terminal.nextDouble();

        total += preco;
        salario += preco * 0.3;
      }
      System.out.println("nome do funcionario: " + nome);
      System.out.printf("total de vendas: %.2f R$\n", total);
      System.out.printf("salario: %.2f R$\n", salario);

      System.out.print("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
      terminal.nextLine();

      if (terminal.nextLine().charAt(0) == 'n')
        break;
    }

		terminal.close();
	}
}
