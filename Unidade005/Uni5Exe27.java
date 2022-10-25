package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe27 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		int diaDoMes = 0;
		int pecasManha = 0;
		int pecasTarde = 0;

		int novoFuncionario = 1;

		int diaMaiorProducao = 0;
		int maiorProducao = 0;

		double salario = 0;

		while (novoFuncionario == 1) {

			while (diaDoMes < 1 || diaDoMes > 30) {

				System.out.print("dia de abril: ");
				diaDoMes = terminal.nextInt();

				if (diaDoMes < 0 && diaDoMes > 30)
					System.out.println("Dia invalido");
			}

			System.out.print("pecas produzidas na manha: ");
			pecasManha = terminal.nextInt();

			System.out.print("pecas produzidas na tarde: ");
			pecasTarde = terminal.nextInt();

			if (pecasManha < pecasTarde) {
				System.out.println("funcionario produz mais na manha");
				System.out.printf("pecas produzidas na manha: %d\n", pecasManha);
			} else if (pecasTarde < pecasManha) {
				System.out.println("funcionario produz mais na tarde");
				System.out.printf("pecas produzidas na tarde: %d\n", pecasTarde);
			} else
				System.out.println("funcionario produz igualmente nos dois turnos");

			if (pecasManha + pecasTarde > maiorProducao) {
				maiorProducao = pecasManha + pecasTarde;
				diaMaiorProducao = diaDoMes;
			}

			if (diaDoMes < 16) {
				if (pecasManha + pecasTarde > 100 &&
					pecasManha > 30 &&
					pecasTarde > 30)
					salario = (pecasManha + pecasTarde) * 0.8;
				else
					salario = (pecasManha + pecasTarde) * 0.5;
			} else if (diaDoMes > 15)
				salario = pecasManha * 0.4 + pecasTarde * 0.3;

			System.out.printf("R$ %.2f (valor recebido)\n", salario);

			System.out.print("Novo funcionario (1.sim 2.nao)? ");
			novoFuncionario = terminal.nextInt();
		}

		System.out.printf("dia da maior producao: %d\n", diaMaiorProducao);
		System.out.printf("quantidade produzida: %d\n", maiorProducao);

		terminal.close();
	}
}
