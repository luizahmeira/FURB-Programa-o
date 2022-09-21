import java.util.Scanner;
public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            System.out.println("1 - Soma de dois números. \n2 - Diferença entre dois números. \n3 - Produto entre dois números. \n4 - Divisão entre dois números (o denominador não pode ser zero).");
            int opcao = terminal.nextInt();
            System.out.println("Informe dois números, sendo que o primeiro número é maior que o primeiro");
            int num1 = terminal.nextInt();
            int num2 = terminal.nextInt();

            switch(opcao) {
                case 1:
                    int soma = num1 + num2;
                    System.out.println("A soma dos dois números é: " + soma);
                    break;
                case 2: 
                    int dif = num1 - num2;
                    System.out.println("A diferença dos dois números é: " + dif);
                    break;
                case 3:
                    int produto = num1 * num2;
                    System.out.println("O produto dos dois números é: " + produto);
                    break;
                case 4:
                    int div = num1 / num2;
                    System.out.println("A divisão dos dois números é: " + div);
                    break;

            }
            terminal.close();
    }
}
