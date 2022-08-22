import java.util.Scanner;
public class ex001 {
    public static void main(String[] args) {
        //Uma imobiliária vende apenas terrenos retangulares.
        // Faça um programa para
        //ler as dimensões de um terreno e depois exibir a área do terreno.
        Scanner terminal = new Scanner(System.in);
            System.out.print("Informe a largura do terreno: ");
            float largura = terminal.nextFloat();
            System.out.print("Informe o comprimento do terreno: ");
            float comprimento = terminal.nextFloat();

            float area = (largura * comprimento);
            System.out.print("A area do terreno é: " + area);
            
        terminal.close();
    }
}
