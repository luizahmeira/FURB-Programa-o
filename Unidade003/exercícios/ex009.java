import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
       Scanner terminal = new Scanner(System.in);
       
        //Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
        //volume = pi * (raio*raio) * altura;
        double pi = 3.14;

        System.out.print("De o valor do raio para calcular o volume da lata: ");
        double raio = terminal.nextDouble();
        System.out.print("De o valor da altura para calcular o colume da lata: ");
        double altura = terminal.nextDouble();

        double volume = pi * (raio*raio) * altura;
        System.out.print("O volume da lata é: " + volume);
        terminal.close();

    }
}
