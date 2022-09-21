import java.util.Scanner;
public class ex016 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            System.out.print("Informe o valor do pagamento: ");
            int notas = terminal.nextInt(); 
            int notas100 = notas / 100;
            notas -= notas100 * 100;
            int notas10 = notas / 10;
            notas -= notas10 * 10;
            int notas1 = notas / 1;

            System.out.println("Numero mínimo de notas de 100: " + notas100);
            System.out.println("Numero mínimo de notas de 10: " + notas10);
            System.out.println("Numero mínimo de notas de 1: " + notas1);
        terminal.close();
    }
}
