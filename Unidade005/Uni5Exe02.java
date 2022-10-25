package Unidade005.exercícios;
import java.util.Scanner;
public class Uni5Exe02 {
   public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            int somaPar = 0, somaImpar = 0;
            for(int contador = 1; contador <= 100; contador++) {
                
                if(contador %2 == 0) {
                    somaPar += contador;
                } else {
                    somaImpar += contador;
                }
            }
            System.out.println("A soma dos pares é: " + somaPar);
            System.out.println("A soma dos ímpares é: " + somaImpar);
        terminal.close();
   }
}
