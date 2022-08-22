import java.util.Scanner;
public class ex010 {
    public static void main(String[] args) {
        //Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
        Scanner terminal = new Scanner(System.in);

        System.out.print("De o valor do cateto1 para calcular a hipo: ");
        double cateto1 = terminal.nextDouble();
        System.out.print("De o valor do cateto2 para calcular a hipo: ");
        double cateto2 = terminal.nextDouble();

        double hipotenusa = (Math.sqrt(cateto1 * cateto1) + (cateto2 * cateto2));
        
        System.out.print("A hipotenusa é: " + hipotenusa);

        terminal.close();
    }
}
