package Unidade005.exercícios;
import java.util.Scanner;

public class Uni5Exe16 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

    int nMulheres = 0;    int total = 0;    
    double totalAltura = 0;    double totalMulheres = 0;
    double altura;    char sexo;

    while (true) {
      System.out.print("sexo: ");
      sexo = terminal.next().toUpperCase().charAt(0);

      System.out.print("altura: ");
      altura = terminal.nextDouble();

      if (altura == 0)
        break;

      if (sexo == 'F') {
        totalMulheres += altura;
        nMulheres++;
      }

      totalAltura += altura;
      total++;

    } 

    totalAltura /= total;
    System.out.printf("media de altura: %.2f M\n", totalAltura);


    totalMulheres /= nMulheres;
    System.out.printf("media de altura das mulheres: %.2f M\n", totalMulheres);

		terminal.close();
	}
}
