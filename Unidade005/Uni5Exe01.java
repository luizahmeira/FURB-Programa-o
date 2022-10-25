package Unidade005.exercícios;
import java.util.Scanner;
public class Uni5Exe01 {
   public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            int numero;
            for(numero = 1; numero <= 20; numero ++) {

                System.out.println("Informe numero: " + numero);
                numero = terminal.nextInt();
                
                if(numero %2 == 0) {
                    System.out.println(numero + " é par");
                } else if(numero%2 != 0){
                    System.out.println(numero + " é ímpar");
                }
        }
        terminal.close();
   }
}