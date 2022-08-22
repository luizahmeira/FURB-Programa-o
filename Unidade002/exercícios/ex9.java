// Enunciado: Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
//  o código de uma peça 2, o número de peças 2 
// e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.


import java.util.Scanner; //ler informaçao do teclado

public class ex9 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
     

        System.out.print("Informe o código da peça número 1 que deseja cadastrar (sendo o código um valor inteiro): ");
        int item1 = terminal.nextInt();

        System.out.print("Quanto custa a peça de código: " + item1 + "?");
        float valor1 = terminal.nextFloat();

        System.out.print("Quantas peças de código: " + item1 + " existem?");
        int quantidade1 = terminal.nextInt(); 

        System.out.print("Informe o código da peça número 2 que deseja cadastrar (sendo o código um valor inteiro): ");
        int item2 = terminal.nextInt();

        System.out.print("Quanto custa a peça de código: " + item2 + "?");
        float valor2 = terminal.nextFloat();

        System.out.print("Quantas peças de código: " + item2 + " existem?");
        int quantidade2 = terminal.nextInt(); 

        double fina = (valor1 * quantidade1) + (valor2 * quantidade2);
        System.out.print("o valor final foi de: " + fina);


        terminal.close();
    }
}
