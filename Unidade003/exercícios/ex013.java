import java.util.Scanner;
public class ex013 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o comprimento: ");
        double comprimento = terminal.nextDouble();
        System.out.println("Informe a largura: ");
        double largura = terminal.nextDouble();

        double area = comprimento * largura;
        double azulejo = (area * 9) * 12.5;
        System.out.println("Valor total dos azulejos: " + azulejo);

        terminal.close();
    }
}
