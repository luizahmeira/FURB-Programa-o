import java.util.Scanner;
import java.text.DecimalFormat;
public class ex005 {
    public static void main(String[] args) {
        // Uma granja possui um controle automatizado de cada frango da sua produção.
        //  No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois 
        //  anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa 
        //  R$ 4,00 e o anel de alimento
        //  custa R$ 3,50, faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double anelID = 4.00;
        double anelAL = 2*(3.50);

        System.out.print("Sabendo os valores de cada anel, Quantos frangos existem em sua granja?: ");
        int frangos =  terminal.nextInt();

        double total = (anelID + anelAL)* frangos;

        System.out.print("O valor total dos gastos é: " + df.format(total));
        
        terminal.close();
   
    }

    
}
