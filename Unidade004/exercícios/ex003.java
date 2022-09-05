package exercícios;
import java.util.Scanner;
public class ex003 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        //ENTRADAS
        System.out.println("Informe um número: ");
        int num1 = terminal.nextInt();
        System.out.println("Informe um outro número: ");
        int num2 = terminal.nextInt();
        //PROCESSO E SAÍDA
        if(num1 > num2) {
            System.out.println("O número " + num1 + " é o maior");
        } else{
            System.out.println("O número " + num2 + " é o maior");
        }
        terminal.close();
    }
}
