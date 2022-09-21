import java.util.Scanner;
public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Escolha uma das opções a seguir: ");
        System.out.println("[T]: calcular a área de um triângulo de base b e altura h");
        System.out.println("[Q]: calcular a área de um quadrado de lado l");
        System.out.println("[R]: calcular a área de um retângulo de base b e altura h");
        System.out.println("[C]: calcular a área de um círculo de raio r");
        char opcao = terminal.nextLine().charAt(0);

        switch(opcao) {
            case 'T':
                System.out.println("Digite o valor da base b: ");
                double base = terminal.nextDouble();
                System.out.println("Digite o valor da altura h: ");
                double altura = terminal.nextDouble();

                System.out.println("A área é: " + (base * altura)/2);
            break;
            case 'Q':
                System.out.println("Digite o valor do lado l: ");
                double lado = terminal.nextDouble();

                System.out.println("A área é: " + lado*lado);
            break;
            case 'R':
                System.out.println("Digite o valor da base b: ");
                double baseb = terminal.nextDouble();
                System.out.println("Digite o valor da altura h");
                double alturah = terminal.nextDouble();

                System.out.println("A área é: " + baseb * alturah);
            break;
            case 'C':
                System.out.println("Digite o valor do raio r");
                double raio = terminal.nextDouble();
                
                System.out.println("A área é: " + Math.PI * Math.pow(raio, 2));
            break;
            default:
                System.out.println("Essa opção não existe");
        }
        terminal.close();
    }
}

