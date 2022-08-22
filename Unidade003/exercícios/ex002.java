import java.util.Scanner;
public class ex002 {
    public static void main(String[] args) {
        // Uma loja de calçados está concedendo 12% de desconto nos produtos.
        //  Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e quanto
        //   deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário.
        //    Como resultado, o programa deverá exibir as seguintes mensagens:

        // O valor do desconto é de R$ xxx
        // O preço do par de sapatos com desconto é R$ xxx
        Scanner terminal = new Scanner(System.in);
            System.out.print("Qual é o valor do par de sapatos?: ");
            float preço = terminal.nextFloat();

            float desconto = (preço * 0.12f);
            System.out.println("O desconto na compra do par de sapatos é de 12% e em reais fica: " + desconto + "R$");

            float compra = (preço - desconto);
            System.out.println("O valor final da compra é: " + compra + "R$");
    
        terminal.close();
}
    }