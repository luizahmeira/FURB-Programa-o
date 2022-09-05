package exercícios;
import java.util.Scanner;
public class ex002 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        //ENTRADA
        System.out.println("Informe um valor inteiro que seja maior que 0: ");
        int num = terminal.nextInt();
        //PROCESSO E SAÍDA
        if(num%2 == 0) {
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("O número " + num + " é ímpar");
        }
        terminal.close();
    }
}
