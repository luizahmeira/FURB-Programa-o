import java.util.Scanner;
import java.text.DecimalFormat;

public class ex006 {
    public static void main(String[] args) {
        // Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um 
        // programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar.
        //  O peso do prato é de 750 gramas
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df =  new DecimalFormat("0.00");

        double quilo = 25.00;
        double quiloGramas = 1;
        double pratoGramas = 0.75;

        System.out.print("Peso do prato: ");
        double prato = terminal.nextDouble();

        double total = ((prato - pratoGramas)/quiloGramas)*quilo;
        System.out.print("VALOR A PAGAR: R$ " + df.format(total));

        terminal.close();
    }
}