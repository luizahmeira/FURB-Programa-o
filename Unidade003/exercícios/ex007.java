import java.util.Scanner;
import java.text.DecimalFormat;
public class ex007 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Uma fábrica de refrigerantes vende seu produto em três formatos:
        //  lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um 
        // comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular 
        // quantos litros de refrigerante ele comprou.

        //cdastrar as latinhas, perguntar quantas latinhas de cda formato o comerciante comprou, e calcular quantos
        //litros de bebida ele comprou

        double latinha = 0.35;
        double garrafinha = 0.60;
        int garrafa = 2;

        System.out.print("Quantas latinhas de 350ml foram compradas?: ");
        double latinhaComprada = terminal.nextDouble();
        System.out.print("Quantas garrafinhas de 600ml foram compradas?: ");
        double garrafinhaComprada = terminal.nextDouble();
        System.out.print("Quantas garrafas de 2L foram compradas?: ");
        int garrafaComprada = terminal.nextInt();

        double calculo = (latinha * latinhaComprada) + (garrafinha + garrafinhaComprada) + (garrafa * garrafaComprada);
        System.out.print("Foi comprado um total de: " + df.format(calculo) + " L.");

        terminal.close();
    }
}