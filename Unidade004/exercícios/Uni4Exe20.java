import java.util.Scanner;
import java.text.DecimalFormat;
public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = terminal.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = terminal.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = terminal.nextDouble();
        System.out.println("Digite a média dos exercícios:");
        double exercicio = terminal.nextDouble();

        double media = ((nota1 * 1) + (nota2 * 2) + (nota3 * 3) + exercicio)/7;

        if(media >= 9) {
            System.out.println("A sua média é: " + df.format(media) + " E o conceito é: A");
        } else if(media >= 7.5) {
            System.out.println("A sua média é: " + df.format(media) + " E o conceito é: B");
        } else if(media >= 6) {
            System.out.println("A sua média é: " + df.format(media) + " E o conceito é: C");
        } else if(media >= 4) {
            System.out.println("A sua média é: " + df.format(media) + " E o conceito é: D");
        } else if(media < 4) {
            System.out.println("A sua média é: " + df.format(media) + " E o conceito é: E");
        }

        
        terminal.close();
    }
}
