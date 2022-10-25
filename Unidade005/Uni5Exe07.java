package Unidade005.exercícios;
import java.util.Scanner;
//solicitar numero inteiro(int) do usuário
//fazer laço for para repetir as n vezes 
//dentro do laço for(for):
//identificar o > numero informado
//identificar o < numero informado
//final = imprimir o maior e o menor
public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

            System.out.println("Informe a quantidade de números: ");
            int n = terminal.nextInt();
            double numeroN = 0;
            double maiorValor = 0;
            double valorMenor = 0;

            for(int contador = 1; contador <= n; contador++) {
                System.out.println("Informe um número do tipo real: ");
                numeroN = terminal.nextDouble();

                if(contador == 1){ //primeira vez que está entrando
                    maiorValor = numeroN;
                    valorMenor = numeroN;
                } else {
                    if(numeroN < valorMenor) {
                        valorMenor = numeroN;
                    }
                    if(numeroN > maiorValor) {
                        maiorValor = numeroN;
                    }
                }

            }
            
            System.out.println("O maior valor é:" + maiorValor);
            System.out.println("O menor valor é:" + valorMenor);

        terminal.close();
    }
}
